package test;

import br.com.senai.model.dto.Contato;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ContatoTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @entidade
        Contato contato = new Contato();

        // seta os valores para os atributos
        contato.setEmail("");
        contato.setCelular("");
        contato.setTelefone("");
        contato.setRecado("");

        // cria uma entidade de gerenciamento para persistências
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senai");
        EntityManager em = emf.createEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(contato);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
        emf.close();
    }
}
