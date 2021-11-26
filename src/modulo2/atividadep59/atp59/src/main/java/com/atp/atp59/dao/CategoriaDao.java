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

    public int create(Categoria model){
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a persistencia (o insert)
        this.em.persist(model);
        // realiza a transacao
        this.em.getTransaction().commit();
        // ao fazer a persistencia, ele já faz o set do id
        return model.getId();
    }

    public List<Categoria> read(){
        // faz a busca e atribui uma lista do tipo categoria
        return this.em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }

    public void update(Categoria model){
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a atualizacao no bd
        this.em.merge(model);
        // realiza a transacao
        this.em.getTransaction().commit();
    }

    public void delete(int id){
        //antes de realizar a delecao, precisa pegar a entidade no BD
        Categoria model = em.find(Categoria.class, id);
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a remocao no bd
        this.em.remove(model);
        // realiza a transacao
        this.em.getTransaction().commit();
    }
}
