package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Dentista;

public class DentistaDao {

	Session s;

	Transaction t;

	public void save(Dentista d) throws Exception {

		s = HibernateUtil.getSessionFactory().openSession();

		t = s.beginTransaction();

		s.save(d);

		t.commit();

		s.close();

	}

	public List<Dentista> findByAll() throws Exception {

		s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Dentista> lista = s.createQuery("from Dentista").list();
		s.close();
		return lista;

	}

}
