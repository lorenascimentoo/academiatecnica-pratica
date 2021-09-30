
public class CalculadoraTaxas {

    public double taxaTransferencia(double valorTransf, Conta saque){
        double taxaTransf = valorTransf * (0.001)/100;
        saque.sacar(taxaTransf);
        return taxaTransf;
    }

    public double taxaSaque(Conta saque){
        double taxa = 1.30;
        saque.sacar(taxa);
        return taxa;
    }
    
}