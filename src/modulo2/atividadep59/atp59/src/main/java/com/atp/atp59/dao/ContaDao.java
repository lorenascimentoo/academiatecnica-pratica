package com.atp.atp59.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.atp.atp59.model.Conta;

public class ContaDao {
    EntityManager em;
    public ContaDao() {
        this.em = new ConnectionFactory().getConnection();
    }

    public int create(Conta model){
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a persistencia (o insert)
        this.em.persist(model);
        // realiza a transacao
        this.em.getTransaction().commit();
        // ao fazer a persistencia, ele já faz o set do id
        return model.getId();
    }

    public List<Conta> read(){
        // faz a busca e atribui uma lista do tipo Conta
        return this.em.createQuery("SELECT c FROM Conta c", Conta.class).getResultList();
    }

    public void update(Conta model){
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a atualizacao no bd
        this.em.merge(model);
        // realiza a transacao
        this.em.getTransaction().commit();
    }

    public void delete(int id){
        //antes de realizar a delecao, precisa pegar a entidade no BD
        Conta model = em.find(Conta.class, id);
        //inicia a transacao
        this.em.getTransaction().begin();
        // faz a remocao no bd
        this.em.remove(model);
        // realiza a transacao
        this.em.getTransaction().commit();
    }
}
