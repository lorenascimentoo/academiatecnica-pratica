
public class Veiculo {
    public String marca;
    public String modelo;
    public String placa;
    
    // sobrescrita do metodo para impressao dos dados da classe
    @Override
    public String toString() {
        // gera a string dos dados da classe
        String retorno = "Marca: "+this.marca+"\nModelo: "+this.modelo+"\nPlaca: "+this.placa;
        // retorna a string gerada anteriormente
        return retorno;
    }
}