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
    
    // sobrescrita do metodo equals para comparar o id
    @Override
    public boolean equals(Object obj) {
        // verifica se o objeto é uma instancia da classe
        if(obj instanceof Pessoa){
            // faz a conversao do objeto no tipo da classe
            Pessoa comparar = (Pessoa) obj;
            if(this.id == comparar.id){
                // se ambos os valores forem iguais é o mesmo objeto
                return true;
            }
        }
        return false;
    }

    // sobrescrita do metodo toString para impressao dos dados
    @Override
    public String toString() {
        // retorna a string concatenada com as informacoes da classe
        return "== ID: "+this.id+"\n== NOME: "+this.nome+"\n== ENDERECO: "+this.endereco;
    }
}