package test;

import br.com.senai.model.dto.Usuario;
import br.com.senai.config.AbstractEntity;

import javax.persistence.EntityManager;

public class UsuarioTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @usuario
        Usuario usuario = new Usuario();

        // seta os valores para os atributos
        usuario.setNome("Pedro Henrique França Marques Miranda");
        usuario.setCpf("04325469109");
        usuario.setSexo(1);

        // cria uma entidade de gerenciamento para persistências
        EntityManager em = new AbstractEntity().getEntityManager();

        // inicia transação para persistência de dados
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        em.close();
    }
}