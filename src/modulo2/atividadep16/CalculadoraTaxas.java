
public class CalculadoraTaxas {

    public double taxaTransferencia(double valorTransf, Conta saque){
        double taxaTransf = valorTransf * 0.001;
        saque.descontaTaxa(taxaTransf);
        return taxaTransf;
    }

    public double taxaSaque(boolean limite,Conta saque){

        if(!limite){
            System.out.println("Você excedeu o limite de saques!");
            double taxa = 1.30;
            saque.descontaTaxa(taxa);
            return taxa;
        }
        return 0.0;      
    }    
}