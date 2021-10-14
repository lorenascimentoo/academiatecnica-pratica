package controller;

import java.util.ArrayList;

import model.Livro;

public class LivroController {
    //Camada de controle, onde devem ser inseridos os métodos para CRUD dos livros
    
    // array que guardará as informações dos livros
    // encapsulado, seu acesso e modificações serão feitas por métodos
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    // CRUD: metodos para inserção, leitura, atualizacao, deleção de livros

    //CREATE
    // insere um livro a lista(array)
    public void salvar(Livro livro){
        // o metodo salvar recebe um objeto do tipo livro
        // depois chama o metodo add do arraylist adiciona o objeto livro na lista
        this.livros.add(livro);
    }

    //READ
    // retorna uma lista de livros
    public ArrayList<Livro> listar(){
       return this.livros;
    }

    // UPDATE
    // atualiza as informações de um livro
    public void atualizar(Livro livro){
        // o metodo atualizar recebe um objeto do tipo livro
        
        // Para evitar erro do foreach um objeto livro auxiliar foi criado para receber o livro a ser deletado e é inicializado com o livro recebido
        Livro aux = livro;
        // boolean que verifica se deve ser feita a atualizacao do livro
        boolean atualiza = false;
        
        // depois faz um laco para verificar na lista de livros o objeto a ser atualizado
        for (Livro liv : this.livros) {
            // verifica se o id do livro verificado no laço é igual ao do livro recebido no metodo
            if(liv.getId() == livro.getId()){
                aux = liv;
                atualiza = true;
            }
        }

        if(atualiza){
            // remove as informações anteriores
            this.deletar(aux);
            // adiciona as novas informações
            this.salvar(livro);
        }
    }

    //DELETE
    // remove um livro da lista(array)
    public void deletar(Livro livro){
        // o metodo deletar recebe um objeto do tipo livro
        // depois chama o metodo remove do arraylist passando o objeto livro para ser removido da lista
        this.livros.remove(livro);
    }


}
