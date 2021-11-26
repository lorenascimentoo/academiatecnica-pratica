package com.atp.atp59.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    EntityManager eManager;
    
    public ConnectionFactory(){
        // name definido no arquivo persistence.xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        this.eManager = factory.createEntityManager();
    }

    public EntityManager getConnection(){
        return this.eManager;
    }
}
