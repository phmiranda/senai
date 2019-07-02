package test;

import br.com.senai.model.dto.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class UsuarioTest {
    public static void main(String[] args) {
        // instancia um objeto do tipo @usuario
        Usuario usuario = new Usuario();

        // seta os valores para os atributos
        usuario.setNome("Pedro Henrique França Marques Miranda");
        usuario.setCpf("04325469109");
        usuario.setDataNascimento(new Date());
        usuario.setSexo(1);

        // cria uma entidade de gerenciamento para persistências
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("senai");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // inicia transação para persistência de dados
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();

        // finaliza o gerenciamento das entidades
        entityManager.close();
        entityManagerFactory.close();
    }
}