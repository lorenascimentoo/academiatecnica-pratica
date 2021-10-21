package model;

// a classe herda o comportamento da classe pessoa
public class PessoaJuridica extends Pessoa{

    public String cnpj;

    // dada a heranca a classe mãe pessoa espera um id para inicializacao
    // assim, ao iniciar a pessoa juridica deve ser informado o id
    public PessoaJuridica(int id){
        //chama o metodo contrutor da mae passando o id recebido
        super(id);
    }

    // nao e necessario o metodo equals, pois o objeto PessoaJuridica e uma Pessoa
    // a validacao sera feita na classe mae

     // sobrescrita do metodo toString para impressao dos dados
     @Override
     public String toString() {
         // pela heranca, primeiro chama o metodo toString da classe mae e depois concatena com os dados da classe
         return super.toString() + "\n== CPF: "+this.cnpj;
     }
}