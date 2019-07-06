package test;

import br.com.senai.model.dto.UnidadeFederativa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UnidadeFederativaTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @entidade
        UnidadeFederativa unidadeFederativa = new UnidadeFederativa();

        // seta os valores para os atributos
        unidadeFederativa.setUnidadeFederativa("Acre");
        unidadeFederativa.setSigla("AC");

        // cria uma entidade de gerenciamento para persistências
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senai");
        EntityManager em = emf.createEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(unidadeFederativa);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
        emf.close();
    }
}
