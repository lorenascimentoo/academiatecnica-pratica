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
}
