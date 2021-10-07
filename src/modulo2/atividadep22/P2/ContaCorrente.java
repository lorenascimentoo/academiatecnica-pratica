package P2;

public class ContaCorrente {
    // atributos encapsulados
    private double saldo;
    private double taxa_saque;
    private int codigo_cliente;

    // metodo construtor que recebe o saldo e o codigo do cliente
    // e atribui aos atributos da classe
    public ContaCorrente(double saldo, int codigo_cliente){
        this.saldo = saldo;
        this.codigo_cliente = codigo_cliente;
    }

    // metodo de saque, debita o valor e taxa de saque e atribui ao saldo
    public void saque(double valor){
        this.saldo -= (valor + this.taxa_saque);
    }

    // metodo de deposito, soma o valor e atribui ao saldo
    public void deposito(double valor){
        this.saldo += valor;
    }
}
