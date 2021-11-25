package com.atp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.atp.atp59.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("== SISTEMA DE BANCO COM JPA ==");
        
        // inicializando e atribuindo valores ao model a ser adicionado ao BD
        Categoria model = new Categoria();
        model.setNome("Teste2 JPA no Maven");
        model.setDescricao("Vem aí menos dor de cabeça, quem amou?");

        // name definido no arquivo persistence.xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco");
        EntityManager em = factory.createEntityManager();

        //fazendo uma insercao no BD
        
        //inicia a transacao
        em.getTransaction().begin();
        // faz a persistencia (o insert)
        em.persist(model);
        // realiza a transacao
        em.getTransaction().commit();

        // faz a busca e atribui uma lista do tipo categoria
        List<Categoria> lista = em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

        for (Categoria categoria : lista) {
            System.out.printf("ID: %d - NOME: %s - DESCRICAO: %s\n",categoria.getId(),categoria.getNome(),categoria.getDescricao());
        }
    }
}
