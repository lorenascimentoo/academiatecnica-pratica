
public class CalculadoraTaxas {

    // metodo que recebe o valor da transferencia, calcula a taxa e retorna a taxa
    public double taxaTransferencia(double valorTransf){
        double taxaTransf = valorTransf * (0.001/100);
        return taxaTransf;
    }

    // metodo que verifica se o usuario possui limite para saque, se tiver retorna 0.0
    // caso não tenha, retorna o valor da taxa que é fixo
    public double taxaSaque(boolean limite){

        if(!limite){
            System.out.println("Você excedeu o limite de saques!");
            double taxa = 1.30;
            return taxa;
        }
        return 0.0;      
    }    
}