package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer idCliente;

	@Column(nullable = false, length = 10, unique = true)
	private Integer prontuario;

	@Column(nullable = false, length = 30)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false, length = 15)
	private Date dtCad;

	@Column(nullable = false, length = 30)
	private String indicacao;

	@Column(nullable = false, length = 30)
	private String dentista;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idCliente, Integer prontuario, String nome,
			Date dtCad, String indicacao, String dentista) {
		super();
		this.idCliente = idCliente;
		this.prontuario = prontuario;
		this.nome = nome;
		this.dtCad = dtCad;
		this.indicacao = indicacao;
		this.dentista = dentista;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", prontuario=" + prontuario
				+ ", nome=" + nome + ", dtCad=" + dtCad + ", indicacao="
				+ indicacao + ", dentista=" + dentista + "]";
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getProntuario() {
		return prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtCad() {
		return dtCad;
	}

	public void setDtCad(Date dtCad) {
		this.dtCad = dtCad;
	}

	public String getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}

	public String getDentista() {
		return dentista;
	}

	public void setDentista(String dentista) {
		this.dentista = dentista;
	}

}
