public class Pessoa {

    public String nome;
    public String sobrenome;
    public int idade;
    
    @Override
    public boolean equals(Object obj) {
        // converte o object recebido em um objeto do tipo pessoa
        Pessoa pVerificada = (Pessoa) obj;
        // verifica se todos os dados do objeto são iguais
        // as strings são verificadas pelo metodo equals da classe string
        // a classe byte não possui o metodo equals, assim foi feita com o operador de comparacao ==
        if(this.nome.equals(pVerificada.nome) && this.sobrenome.equals(pVerificada.sobrenome) && this.idade == pVerificada.idade){
            return true;
        }

        // caso nao seja igual retorna false
        return false;
    }
}