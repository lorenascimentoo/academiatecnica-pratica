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
        
    }
}
