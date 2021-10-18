public class Main {
    public static void main(String[] args) {
        
        // instanciando um objeto do tipo veiculo
        Veiculo veiculo1 = new Veiculo();
        // atribuindo valores aos atributos do objeto do tipo veiculo
        veiculo1.marca = "Fiat";
        veiculo1.modelo = "MOBI";
        veiculo1.placa = "XD41C44";

        // instanciando um objeto do tipo carro
        Carro carro1 = new Carro();
        // atribuindo valores aos atributos do objeto do tipo carro
        carro1.capacidade_portamalas = "30L";
        carro1.numero_portas = 4;

        //Criacao de um object a partir do objeto da classe veiculo
        Object objV = veiculo1;

        //Criacao de um object a partir do objeto da classe carro
        Object objC = carro1;

        //Conversao de um object em um objeto veiculo
        Veiculo veiculoObj = (Veiculo) objV;

        //Conversao de um object em um objeto carro
        Carro carroObj = (Carro) objC;

        // impressao dos dados do objeto veiculo convertido
        System.out.println("Marca: "+veiculoObj.marca);
        System.out.println("Modelo: "+veiculoObj.modelo);
        System.out.println("Placa: "+veiculoObj.placa);
    }
}
