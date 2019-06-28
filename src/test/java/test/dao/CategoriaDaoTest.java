package test.dao;

import br.com.senai.model.dto.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriaDaoTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo Categoria
        Categoria categoria = new Categoria();
        // seta os valores para os atributos
        categoria.setNome("Administração");
        categoria.setDescricao("N/A");
        // cria uma transação para persistir na base de dados
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("senai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(categoria);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
