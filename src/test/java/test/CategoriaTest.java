package test;

import br.com.senai.model.dto.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriaTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @categoria
        Categoria categoria = new Categoria();

        // seta os valores para os atributos
        categoria.setNome("Administração");
        categoria.setDescricao("N/A");

        // cria uma entidade de gerenciamento para persistências
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("senai");
        EntityManager em = emf.createEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
        emf.close();
    }
}
