package br.com.senai.model.dao;

import br.com.senai.model.dto.Categoria;
import br.com.senai.util.AbstractEntity;

import javax.persistence.EntityManager;

public class CategoriaDao {
    public String index(String categorias){
        Categoria categoria = new Categoria();
        EntityManager em = new AbstractEntity().getEntityManager();
        em.getTransaction().begin();
        em.find(Categoria.class, categoria.getId());
        em.getTransaction().commit();
        return categorias;
    }
}
