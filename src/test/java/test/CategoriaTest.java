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
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("senai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // inicia transação para persistência de dados
        entityManager.getTransaction().begin();
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        entityManager.close();
        entityManagerFactory.close();
    }
}
