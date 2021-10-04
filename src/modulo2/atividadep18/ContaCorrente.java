public class ContaCorrente {
    // fazendo o encapsulamento dos atributos
    // tornando-os privados
    private int agencia;
    private int numero;
    private int codCliente;
    private double saldo;
 
    //metodo para acessar o atributo agencia
    public int getAgencia(){
        return this.agencia;
    }
    //metodo para modificar o atributo agencia
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    //metodo para acessar o atributo numero
    public int getNumero(){
        return this.numero;
    }
    //metodo para modificar o atributo numero
    public void setNumero(int numero){
        this.numero = numero;
    }
    //metodo para acessar o atributo codCliente
    public int getCodCliente(){
        return this.codCliente;
    }
    //metodo para modificar o atributo codCliente
    public void setCodCliente(int codCliente){
        this.codCliente = codCliente;
    }
    //metodo para acessar o atributo saldo
    public double getSaldo(){
        return this.saldo;
    }
    //metodo para modificar o atributo saldo
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
}
