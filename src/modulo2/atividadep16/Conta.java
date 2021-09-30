public class Conta {
    // variavel responsavel pelo controle do numero de saques
    int count =0;
    // variavel responsavel pelo valor da conta
    private double saldo;
    
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
        count++;
    }

    public void transferir(double valorTransf, Conta recebe){
        sacar(valorTransf);
        recebe.depositar(valorTransf);
    }
    // metodo que subtrai o valor da taxa do saldo, não poderia ser utilizado o sacar pq se nao conta como saque
    public void descontaTaxa(double taxa){
        saldo -= taxa;
    }

    // metodo utilizado se a quantidade de saques alcancou o limite definido
    public boolean verificaLimiteSaque(){ 
        if(count == 5){
            count = 0;
            return false;
        }
        return true;
    }

    // exibe a mensagem de realizacao da transacao e o valor da taxa
    public void imprimeTransacao(String operacao, double valor,double taxa){
        System.out.println("====== TRANSAÇÃO REALIZADA COM SUCESSO ======");
        System.out.printf("Valor de %s: %.2f  || TAXA: %.2f \n",operacao,valor,taxa);
        System.out.printf("---- SALDO DA CONTA: %.2f\n",saldo);
        System.out.println("=============================================\n");
    }

}
