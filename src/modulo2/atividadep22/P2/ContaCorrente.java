package P2;

public class ContaCorrente {
    // atributos encapsulados
    private double saldo;
    private double taxa_saque = 3.82;
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

    // criacao dos metodos getters para acesso dos valores
    // nao e boa pratica acessar diretamente os atributos da classe
    // assim sendo necessario os metodos
    public double getSaldo() {
        return saldo;
    }
    public double getTaxa_saque() {
        return taxa_saque;
    }
    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    // metodo toString da classe objeto sobrescrito
    @Override
    public String toString() {
        String mensagem = "== CODIGO DO CLIENTE: " + this.getCodigo_cliente() +"\n"+"== TAXA DE SAQUE: " + this.getTaxa_saque() +"\n"+"== SALDO: " + this.getSaldo();
        return mensagem;
    }
}
