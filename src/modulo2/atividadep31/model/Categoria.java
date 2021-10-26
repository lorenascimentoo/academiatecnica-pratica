package model;

import java.util.ArrayList;
//heranca
public class Categoria extends Base{
    public String descricao;
    // composicao
    // uma categoria pode ter uma lista de produtos
    public ArrayList<Produto> produtos;
    
    // metodo construtor da classe categoria
    public Categoria(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }
    // sobrescrita do metodo para impressao dos dados
    @Override
    public String toString() {
        return super.toString() + "\n== DESCRICAO: "+this.descricao;
    }
}
