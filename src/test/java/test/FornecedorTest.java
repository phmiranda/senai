package test;

import br.com.senai.model.dto.Fornecedor;
import br.com.senai.config.AbstractEntity;

import javax.persistence.EntityManager;

public class FornecedorTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @entidade
        Fornecedor fornecedor = new Fornecedor();

        // seta os valores para os atributos
        fornecedor.setEmpresa("Empresa Fictícia");
        fornecedor.setRazaoSocial("Empresa Fictísica S/A");
        fornecedor.setInscricaoEstadual("999999999");

        // comentário
        EntityManager em = new AbstractEntity().getEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(fornecedor);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
    }
}
