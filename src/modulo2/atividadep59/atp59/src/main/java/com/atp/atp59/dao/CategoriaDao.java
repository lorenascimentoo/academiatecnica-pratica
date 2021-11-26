package com.atp.atp59.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.atp.atp59.model.Categoria;

public class CategoriaDao {
    EntityManager em;
    public CategoriaDao() {
        // name definido no arquivo persistence.xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.em = factory.createEntityManager();
    }

    public void create(Categoria model){
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a persistencia (o insert)
        this.em.persist(model);
        // realiza a transacao
        this.em.getTransaction().commit();
    }

    public List<Categoria> read(){
        // faz a busca e atribui uma lista do tipo categoria
        return this.em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }
}
