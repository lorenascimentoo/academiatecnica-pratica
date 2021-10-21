package controller;
// classe mae com o comportamento padrao do controller
// a classe sera abstrata afim de evitar que seja inicializado diretamente um objeto do tipo
// a classe recebe um tipo no momento em que for estendido na classe filha

import java.util.ArrayList;

public class PessoaController<T> {
    // cria um arraylist de dados do tipo recebido
    // o arraylist está encapsulado
    private ArrayList<T> dados;

    // metodo contrutor da classe
    public PessoaController(){
        // inicializa o arraylist do tipo informado na classe
        this.dados = new ArrayList<T>();
    }

    // METODOS CRUD

    // CREATE
    // insere um objeto do tipo recebido na classe na lista
    public void adicionar(T obj){
        // se o objeto nao existe na lista de dados
        if(!objExistente(obj)){
            // entao ele adiciona a lista
            this.dados.add(obj);
        }
    }

    // READ
    // retorna a lista do tipo criado na classe
    public ArrayList<T> listar(){
        return this.dados;
    }

    // UPDATE
    // recebe um objeto do tipo T a ser atualizado
    // remove o objeto anterior e adiciona o objeto recebido
    public void atualizar(T obj){
        // se o objeto já existe
        if(objExistente(obj)){
            // deleta o objeto anterior com o id 
            // verificado no metodo equals
            this.deletar(obj);
            // adiciona o novo objeto com o id
            this.adicionar(obj);
        }
    }

    // DELETE
    // recebe um objeto do tipo T a ser atualizado
    // remove o objeto anterior e adiciona o objeto recebido
    public void deletar(T obj){
        this.dados.remove(obj);
    }

    // metodo que recebe um objeto e verifica se já está inserido na lista
    public boolean objExistente(T obj){
        return this.dados.contains(obj);
    }
}
