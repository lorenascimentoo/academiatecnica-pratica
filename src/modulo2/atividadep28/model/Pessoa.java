package model;

// classe mae com informacoes comuns a outras classes do sistema
// a classe mae sera abstrata afim de evitar que seja inicializado diretamente um objeto do tipo
public abstract class Pessoa {
    // atributos publicos do sistema
    public int id;
    public String nome;
    public String endereco;
    
    // obrigatoriamente ao iniciliazar deve ser informado o id
    public Pessoa(int id){
        this.id = id;
    }
    
}