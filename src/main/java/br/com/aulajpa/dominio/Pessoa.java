package br.com.aulajpa.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe entidade que corresponde a uma tabela no banco
 * @author pedro.lucena
 *
 */

@Entity
public class Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="PESSOA_NOME") //indicando ao jpa que o nome da tabela deve ser o passado no parametro e nao o nome do atributo na classe
	private String nome;
	
	@Column(name="EMAIL")
	private String email;
	
	
	public Pessoa() {}

	public Pessoa(Integer id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//transformando pessoa em string
	@Override
	public String toString() {
		System.out.println("executando toString");
		return "Pessoa [id= " + id + ", nome= " + nome + ", email= " + email + "]";
	}
	
	
	
}
