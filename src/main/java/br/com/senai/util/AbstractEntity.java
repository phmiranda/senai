package br.com.senai.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractEntity {
    // comentário
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("senai");

    // comentário
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
