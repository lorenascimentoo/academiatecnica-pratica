package controller;

import java.util.ArrayList;

public abstract class BaseController<T> {
    private ArrayList<T> dados;

    public BaseController(){
        this.dados = new ArrayList<T>();
    }
    
    // CREATE
    public void adicionar(T obj){
        // nao permite id duplicados na lista
        if(!this.existe(obj)){
            this.dados.add(obj);
        }
    }
    // READ
    public ArrayList<T> listar(){
        return this.dados;
    }
    // UPDATE
    public void atualizar(T obj){
        if(this.existe(obj)){
            this.excluir(obj);
            this.adicionar(obj);
        }
    }
    // DELETE
    public void excluir(T obj){
        this.dados.remove(obj);
    }

    public boolean existe(T obj){
        return this.dados.contains(obj);
    }

    // para retornar um objeto do tipo
    public T buscar(T obj){
        for (T t : dados) {
            if(t.equals(obj)){
                return t;
            }
        }
        return null;
    }
}
