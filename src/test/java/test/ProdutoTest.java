package test;

import br.com.senai.model.dto.Produto;
import br.com.senai.util.AbstractEntity;

import javax.persistence.EntityManager;

public class ProdutoTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @entidade
        Produto produto = new Produto();

        // seta os valores para os atributos
        produto.setNome("Farinha de Trigo");
        produto.setPreco(100.0);
        produto.setQuantidade(250);
        produto.setDescricao("N/A");

        // comentário
        EntityManager em = new AbstractEntity().getEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
    }
}
