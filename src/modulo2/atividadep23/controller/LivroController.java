package controller;

import java.util.ArrayList;

import model.Livro;

public class LivroController {
    // Camada de controle, onde devem ser inseridos os métodos para CRUD dos livros

    // array que guardará as informações dos livros
    // encapsulado, seu acesso e modificações serão feitas por métodos
    private ArrayList<Livro> livros = new ArrayList<Livro>();

    // CRUD: metodos para inserção, leitura, atualizacao, deleção de livros

    // CREATE
    // insere um livro a lista(array)
    public void salvar(Livro livro) {
        // o metodo salvar recebe um objeto do tipo livro
        // depois chama o metodo add do arraylist adiciona o objeto livro na lista
        this.livros.add(livro);
    }

    // READ
    // retorna uma lista de livros
    public ArrayList<Livro> listar() {
        return this.livros;
    }

    // UPDATE
    // atualiza as informações de um livro
    public void atualizar(Livro livro) {
        // o metodo atualizar recebe um objeto do tipo livro

        // foi criado  um objeto aux do tipo livro a ser deletado
        // e inicializado com o livro recebido atraves do metodo que verifica se ha um livro na lista com o id informado
        // passando o id do livro recebido no metodo atualizar
        Livro aux = this.encontrarLivro(livro.getId());

        // se um livro valido for recebido, então as informacoes sao atualizadas
        if (aux!=null) {
            // remove as informações anteriores
            this.deletar(aux);
            // adiciona as novas informações
            this.salvar(livro);
        }
    }

    // DELETE
    // remove um livro da lista(array)
    public void deletar(Livro livro) {
        // o metodo deletar recebe um objeto do tipo livro
        // depois chama o metodo remove do arraylist passando o objeto livro para ser
        // removido da lista
        this.livros.remove(livro);
    }

    //
    public Livro encontrarLivro(int id) {
        //cria uma variavel auxiliar que vai receber o livro e inicializa como nulo
        Livro aux = null;
        // faz um laço pra percorrer todos os livros da lista
        for (Livro liv : this.livros) {
            // verifica se o id do livro verificado no laço é igual ao id informado
            if (liv.getId() == id) {
                // se verdadeiro o auxiliar recebe o livro a ser deletado
                aux= liv;
            } 
        }
        
        // ao final retorna o livro
        return aux;
    }

}
