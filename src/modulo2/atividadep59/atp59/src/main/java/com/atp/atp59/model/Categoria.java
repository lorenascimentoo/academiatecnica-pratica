package com.atp.atp59.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//anotacao que indica que a classe será uma tabela do BD
@Entity
//para definir o nome da tabela no BD
@Table(name="categoria")
public class Categoria {
    // anotacao que indica que é a chave primaria da tabela
    @Id
    // anotacao para que o atributo tenha seu valor gerado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
