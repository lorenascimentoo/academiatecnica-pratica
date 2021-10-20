package model;
// a classe herda o comportamento da classe base
public class Serie extends Base{
    int quant_temporadas;
    int quant_episodios;
    boolean finalizada;
    String autor;

    // dada a heranca, obrigatoriamente e necesssario passar no construtor o id
    public Serie(int id){
        super(id)
    }
    
}
