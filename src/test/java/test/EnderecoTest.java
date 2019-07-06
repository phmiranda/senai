package test;

import br.com.senai.model.dto.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EnderecoTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @entidade
        Endereco endereco = new Endereco();

        // seta os valores para os atributos
        endereco.setEndereco("Qnn 08 Conjunto Q");
        endereco.setComplemento("N/A");
        endereco.setNumero("21");
        endereco.setCidade("Ceilândia Sul");
        endereco.setCep("72220080");

        // cria uma entidade de gerenciamento para persistências
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senai");
        EntityManager em = emf.createEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(endereco);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
        emf.close();
    }
}
