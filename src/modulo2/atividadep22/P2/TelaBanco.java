package P2;

public class TelaBanco {
    public static void main(String[] args) {
        
        // instanciando um objeto do tipo conta corrente 
        // a partir do metodo construtor passando os valores de saldo e cod cliente
        ContaCorrente cc = new ContaCorrente(200, 4056);

        // realizando um saque
        cc.saque(20.50);

        // realizando um deposito
        cc.deposito(500);

        // IMPRESSAO DOS DADOS
        System.out.println("========== CONTA CORRENTE ==========");
        // com a sobrescrita de metodo ao chamar o metodo toString(chamado por padrao no println), ele usa o metodo da classe conta corrente
        System.out.println(cc);
        System.out.println("====================================");
    }
}