package test;

import br.com.senai.model.dto.Categoria;
import br.com.senai.util.AbstractEntity;

import javax.persistence.EntityManager;

public class CategoriaTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @categoria
        Categoria categoria = new Categoria();

        // seta os valores para os atributos
        categoria.setNome("Administração");
        categoria.setDescricao("N/A");

        //
        EntityManager em = new AbstractEntity().getEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
    }
}
