
public class index {

    public static void main(String[] args) {

        CalculadoraTaxas cT = new CalculadoraTaxas();
        double taxaTransfC1, taxaSaqueC1=0.0;

        Conta c1 = new Conta();
        c1.depositar(1000.00);

        c1.sacar(10.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque(),c1);
        c1.imprimeTransacao("Valor do saque: R$10,00 | Taxa: ", taxaSaqueC1);

        c1.sacar(30.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque(),c1);
        c1.imprimeTransacao("Valor do saque: R$30,00 | Taxa: ", taxaSaqueC1);

        Conta c2 = new Conta();
        c2.depositar(50.0);

        c1.transferir(50.00, c2);    
        taxaTransfC1 = cT.taxaTransferencia(50.00, c1);
        c1.imprimeTransacao("Valor da Transferencia: R$50,00 | Taxa: ", taxaTransfC1);

        c1.sacar(10.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque(),c1);
        c1.imprimeTransacao("Valor do saque: R$10,00 | Taxa: ", taxaSaqueC1);
    
        c1.sacar(15.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque(),c1);
        c1.imprimeTransacao("Valor do saque: R$15,00 | Taxa: ", taxaSaqueC1);
    
    }
    
}