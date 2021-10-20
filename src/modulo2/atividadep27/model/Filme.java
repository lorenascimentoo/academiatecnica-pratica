package model;
// a classe herda o comportamento da classe base
public class Filme extends Base{
    String nacionalidade;
    String distribuidor;
    // dada a heranca, obrigatoriamente e necesssario passar no construtor o id
    public Filme(int id){
        super(id);
    }

}