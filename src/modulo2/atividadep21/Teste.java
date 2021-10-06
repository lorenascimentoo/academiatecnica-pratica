public class Teste {
    public static void main(String[] args) {
        // inicializacao de um novo objeto do tipo Conta
        Conta c = new Conta();
        // utilizando os metodos setters para atribuicao dos valores dos atributos da classe conta
        c.setCod_cliente(1);
        c.setSaldo(100);
        // criando uma variavel para guardar o valor anterior a transferencia do objeto conta
        double c_saldo_anterior = c.getSaldo();
        // realizando uma transferencia no objeto do tipo conta
        c.transferencia(20);

        // inicializacao de um novo objeto do tipo Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        // por heranca, a classe conta corrente recebe os atributos da classe conta
        // utilizando os metodos setters para atribuicao dos valores dos atributos
        cc.setCod_cliente(2);
        // criando uma variavel para guardar o valor anterior a transferencia do objeto conta corrente
        cc.setSaldo(200);
        double cc_saldo_anterior = cc.getSaldo();
        // realizando 6 chamadas de transferencia no objeto do tipo conta corrente para testar os calculos das taxas
        cc.transferencia(50);
        cc.transferencia(10);
        cc.transferencia(10);
        cc.transferencia(10);
        cc.transferencia(10);
        cc.transferencia(5);

        // === IMPRESSAO DOS DADOS ===

        // impressao dos dados objeto conta
        System.out.println("=========== IMPRESSAO CONTA ===========");
        imprimirDadosTransacao(c.getCod_cliente(),c_saldo_anterior,c.getSaldo());
        System.out.println("=======================================");

        // impressao dos dados objeto conta corrente
        System.out.println("======= IMPRESSAO CONTA CORRENTE ======");
        imprimirDadosTransacao(cc.getCod_cliente(),cc_saldo_anterior,cc.getSaldo());
        System.out.println("=======================================");

    }

    public static void imprimirDadosTransacao(int cod,double saldo_anterior, double saldo){
        System.out.println("== CODIGO DO CLIENTE: "+cod);
        System.out.println("== SALDO ANTERIOR: "+saldo_anterior);
        System.out.println("== SALDO ATUAL: "+saldo);
    }

}
