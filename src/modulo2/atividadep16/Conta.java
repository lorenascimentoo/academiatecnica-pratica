public class Conta {
    static int count =0;

    private double saldo;
    
    public void depositar(double valorDeposito){
        saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        saldo -= valorSaque;
        Conta.count++;
    }

    public void transferir(double valorTransf, Conta recebe){
        sacar(valorTransf);
        recebe.depositar(valorTransf);
    }

    public void descontaTaxa(double taxa){
        saldo -= taxa;
    }

    public boolean verificaLimiteSaque(){ 
        if(Conta.count == 5){
            Conta.count = 0;
            return false;
        }
        return true;
    }
}
