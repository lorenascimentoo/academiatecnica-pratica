
public class index {

    public static void main(String[] args) {
        // criacao do objeto que calcula as taxas
        CalculadoraTaxas cT = new CalculadoraTaxas();
        
        // Criacao do primeiro objeto conta
        Conta c1 = new Conta();
        c1.depositar(1000.00);

        // variaveis que recebem os valores das taxas calculadas
        double taxaTransfC1, taxaSaqueC1=0.0;
        
        // realiza o primeiro saque
        c1.sacar(10.0);
        
        //calcula a taxa de saque
        // o boolean do metodo c1.verificaLimiteSaque() indica se o usuario tem saldo e realiza o calculo da taxa
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque());
        
        //realiza o desconto do valor da taxa no saldo da conta
        c1.descontaTaxa(taxaSaqueC1);
        
        // exibe os dados da transacao
        c1.imprimeTransacao("Valor do saque: R$10,00 | Taxa: ", taxaSaqueC1);

        // realiza o segundo saque
        c1.sacar(30.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque());
        c1.descontaTaxa(taxaSaqueC1);
        c1.imprimeTransacao("Valor do saque: R$30,00 | Taxa: ", taxaSaqueC1);

        // Criacao do segundo objeto conta
        Conta c2 = new Conta();
        c2.depositar(50.0);

        // realiza a transferencia do objeto 1 para o objeto 2
        // na logica desse programa, a transferencia também é um saque, logo é contabilizada
        c1.transferir(50.00, c2);
        //calcula a taxa de transferencia
        taxaTransfC1= cT.taxaTransferencia(50.00);
        c1.descontaTaxa(taxaTransfC1);
        // exibe os dados da transacao
        c1.imprimeTransacao("Valor da Transferencia: R$50,00 | Taxa: ", taxaTransfC1);

        // realiza o quarto saque
        c1.sacar(10.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque());
        c1.descontaTaxa(taxaSaqueC1);
        c1.imprimeTransacao("Valor do saque: R$10,00 | Taxa: ", taxaSaqueC1);
        
        // realiza o quinto saque
        c1.sacar(15.0);
        taxaSaqueC1= cT.taxaSaque(c1.verificaLimiteSaque());
        c1.descontaTaxa(taxaSaqueC1);
        c1.imprimeTransacao("Valor do saque: R$15,00 | Taxa: ", taxaSaqueC1);
    
    }
    
}