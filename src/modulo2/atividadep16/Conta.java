public class Conta {
    static int count =0;

    private double saldo;
    

    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
        count++;
    }

    public void transferir(double valorTransf, Conta transfere, Conta recebe){
        transfere.sacar(valorTransf);
        recebe.depositar(valorTransf);
    }

}
