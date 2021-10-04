public class Produto {
    // fazendo o encapsulamento dos atributos
    // tornando-os privados
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
    
    //metodo para acessar o atributo codigo
    public int getCodigo(){
        return this.codigo;
    }
    //metodo para modificar o atributo codigo
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    //metodo para acessar o atributo nome
    public String getNome(){
        return this.nome;
    }
    //metodo para modificar o atributo nome
    public void setNome(String nome){
        this.nome = nome;
    }
    //metodo para acessar o atributo descricao
    public String getDescricao(){
        return this.descricao;
    }
    //metodo para modificar o atributo nome
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    //metodo para acessar o atributo valor
    public double getValor(){
        return this.valor;
    }   
    //metodo para modificar o atributo valor
    public void setValor(double valor){
        this.valor = valor;
    }
}