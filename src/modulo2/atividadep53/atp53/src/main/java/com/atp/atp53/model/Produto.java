package com.atp.atp53.model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private float preco;
    private int id_categoria;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
