package model;

import java.util.Random;

// abstracao, tornando o livro uma classe com seus atributos
public class Livro {

    // atributos da classe encapsulados
    private int id;
    private String titulo;
    private String autor;
    private String editora;

    //metodo construtor para que ao inicializar um objeto da classe já inicialize seus atributos
    public Livro(String titulo, String autor, String editora){
        this.id = geraId();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    //metodo construtor para inicializar um livro a ser atualizado
    public Livro(int id, String titulo, String autor, String editora){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    // metodos de acesso(getters) e modificacao(setters) dos atributos
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    //metodo para gerar o id do objeto automaticamente
    private int geraId(){
        Random id = new Random();
        return id.nextInt(100);
    }

}