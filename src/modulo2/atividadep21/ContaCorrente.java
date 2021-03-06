// a palavra chave extends é utilizava para realizar a heranca de uma classe
// conta corrente herda conta
public class ContaCorrente extends Conta{
    // atributos encapsulados
    private double taxa_transferencia = 10.50;
    private double taxa_manutencao = 2.50;
    private byte numero_transferencias = 0;

    // anotacao que indica a sobrescrita de um metodo
    @Override
    //metodo sobrescrito deve ter a mesma assinatura da classe mae
    public void transferencia(double valor) {
        // chama o metodo da classe mae e executa o codigo definido no escopo do metodo
        // como foi realizada a sobrescrita do metodo a palavra super indica que o uso é do metodo(de mesmo nome) da classe mae
        super.transferencia(valor);
        // a cada transferencia soma um ao numero de transferencia da classe conta corrente
        this.numero_transferencias++;
        // a palavra this, indica que utiliza os metodos herdados da classe mae
        // entao ele recebe o valor retornado de saldo subtrai a taxa de transferencia e atribui o valor ao saldo
        this.setSaldo(this.getSaldo()-taxa_transferencia);

        // o numero de transferencia da classe conta corrente seja igual a 5
        if (this.numero_transferencias == 5) {
            // entao ele recebe o valor retornado de saldo subtrai a taxa de manutencao e atribui o valor ao saldo
            this.setSaldo(this.getSaldo()-taxa_manutencao);
            // depois de debitar, ele zera a quantidade de transferencias
            this.numero_transferencias = 0;
        }
    }
}
