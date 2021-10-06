
public class Conta {
    //atributos encapsulados
    private int cod_cliente;
    private double saldo;
    
    // metodos getters para acesso aos atributos
    // metodo setters para atribuicao dos atributos
    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
}