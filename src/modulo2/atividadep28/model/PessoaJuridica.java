package model;

// a classe herda o comportamento da classe pessoa
public class PessoaJuridica extends Pessoa{

    public String cpf;

    // dada a heranca a classe mãe pessoa espera um id para inicializacao
    // assim, ao iniciar a pessoa juridica deve ser informado o id
    public PessoaJuridica(int id){
        //chama o metodo contrutor da mae passando o id recebido
        super(id);
    }
}