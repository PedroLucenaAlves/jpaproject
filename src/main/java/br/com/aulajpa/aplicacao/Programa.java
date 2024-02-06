package br.com.aulajpa.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aulajpa.dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		

		//SALVANDO OS DADOS NO BANCO
																		//esse e o nome que demos no arquivo persitence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		
		EntityManager em = emf.createEntityManager(); //criando conexao com o banco com as informacoes do nosso persistence.xml
		
		//buscando uma pessoa no banco 
		//Pessoa p = em.find(Pessoa.class, 7); //buscando um objeto pelo seu id na classe 

		//apagando uma pessoa do banco
		
		Pessoa p = em.find(Pessoa.class, 8); //monitorando o objeto para que a JPA consiga remove-lo
		
		em.getTransaction().begin(); //sempre que realizarmos alguma acao no banco que nao seja uma consulta, devemos implementar uma transacao para a acao ser concluida 
		
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println(p);
		
		
		System.out.println("Finalizando dados salvos no banco");
		em.close();
		emf.close();

	}

}
