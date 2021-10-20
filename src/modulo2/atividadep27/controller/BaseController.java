package controller;

import java.util.ArrayList;

import model.Base;

// Classe generica
// em T recebe um tipo
public class BaseController<T> {
   
    // Cria um arraylist do tipo recebido na classe
    private ArrayList<T> dados;

    public BaseController(){
        // inicializa o arraylist do tipo recebido na classe
        this.dados = new ArrayList<T>();
    }

    // METODOS CRUD
    
    // create
    // recebe um objeto do tipo T
    // para evitar ids repetidos, verifica se o objeto já está na lista
    // em caso negativo adiciona a lista
    public void adicionar(T obj){
        if (!encontrarDado(obj)) {
            this.dados.add(obj);
        } 
    }

    // read
    // retorna a lista de dados do tipo T
    public ArrayList<T> listar(){
        return this.dados;
    }
    
    //update
    // recebe um objeto do tipo T
    // Verifica se o objeto já está na lista, entao remove o anterior
    // e adiciona o nome objeto
    public void atualizar(T obj){
        if (encontrarDado(obj)) {
            this.deletar(obj);
            this.adicionar(obj);
        }
    }

    // delete
    // recebe um objeto do tipo T e remove da lista
    public void deletar(T obj){
        this.dados.remove(obj);
    }

    // verifica se já possui um objeto do tipo T na lista
    public boolean encontrarDado(T obj){
        return this.dados.contains(obj);
    }

}
