package persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Cliente;

public class ClienteDao {

	Session s;

	Transaction t;

	public void save(Cliente c) throws Exception {

		s = HibernateUtil.getSessionFactory().openSession();

		t = s.beginTransaction();

		s.save(c);

		t.commit();

		s.close();

	}

	public List<Cliente> findByAll() throws Exception {

		s = HibernateUtil.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		List<Cliente> lista = s.createQuery("from Cliente").list();
		s.close();
		return lista;

	}

}
