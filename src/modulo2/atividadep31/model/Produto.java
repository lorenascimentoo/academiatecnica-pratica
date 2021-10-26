package model;
//heranca
public class Produto extends Base{
    public double valor;
    // composicao
    // o produto deve ter uma categoria
    public Categoria categoria;
    // metodo construtor da classe produto
    public Produto(String nome, double valor, Categoria cat){
        this.nome = nome;
        this.valor = valor;
        this.categoria = cat;
    }
    // sobrescrita do metodo para impressao dos dados
    @Override
    public String toString() {
        return super.toString() + "\n== VALOR: "+this.valor+ "\n== CATEGORIA:"+this.categoria.nome;
    }
}