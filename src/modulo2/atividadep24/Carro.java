// a classe carro herda todos os atributos da classe veiculo
public class Carro extends Veiculo{
    public byte numero_portas;
    public String capacidade_portamalas;

    // sobrescrita do metodo para impressao dos dados da classe
    @Override
    public String toString() {  
        // gera a string dos dados da classe filha(carro)
        String retorno = "\nNumero de portas: "+this.numero_portas+"\nCapacidade porta-malas: "+this.capacidade_portamalas;
        
        // como a classe carro herda da classe veiculo, é necessário imprimir também os atributos herdados
        // primeiro ele chama o metodo toString da mae(veiculo)
        // e concatena retornando a string gerada anteriormente
        return super.toString() + retorno;
    }
}
