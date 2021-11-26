package com.atp.atp59;

import java.util.List;

import com.atp.atp59.dao.CategoriaDao;
import com.atp.atp59.model.Categoria;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("== SISTEMA DE BANCO COM JPA ==");
        CategoriaDao dao = new CategoriaDao();

        // inicializando e atribuindo valores ao model a ser adicionado ao BD
        Categoria model = new Categoria();
        model.setNome("Teste2 JPA com CategoriaDao");
        model.setDescricao("Vem aí menos dor de cabeça, quem amou?");

        //fazendo uma insercao no BD
        dao.create(model);
        
        // faz a busca e atribui uma lista do tipo categoria
        List<Categoria> lista = dao.read();

        for (Categoria categoria : lista) {
            System.out.printf("ID: %d - NOME: %s - DESCRICAO: %s\n",categoria.getId(),categoria.getNome(),categoria.getDescricao());
        }
    }
}
