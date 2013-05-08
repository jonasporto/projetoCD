package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Dentista{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false, length=10)
	private Integer idDentista;

	@Column(nullable=false , length=15, unique=true)
	private Integer cpf;

	@Column(nullable=false, length=30)
	private String nome;

	@Column(nullable=false, length=30)
	private String especialidade;

	@Column(nullable=false, length=30)
	private Integer status;// 0 - ativo , 1 - Desligado

	
	
	public Dentista() {
		// TODO Auto-generated constructor stub
	}



	public Dentista(Integer idDentista, Integer cpf, String nome,
			String especialidade, Integer status) {
		super();
		this.idDentista = idDentista;
		this.cpf = cpf;
		this.nome = nome;
		this.especialidade = especialidade;
		this.status = status;
	}



	@Override
	public String toString() {
		return "Dentista [idDentista=" + idDentista + ", cpf=" + cpf
				+ ", nome=" + nome + ", especialidade=" + especialidade
				+ ", status=" + status + "]";
	}



	public Integer getIdDentista() {
		return idDentista;
	}



	public void setIdDentista(Integer idDentista) {
		this.idDentista = idDentista;
	}



	public Integer getCpf() {
		return cpf;
	}



	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEspecialidade() {
		return especialidade;
	}



	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}



	public Integer getStatus() {
		return status;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}

	

}
