public class TelaPrincipalBanco {

    public static void main(String[] args) {
        //Instanciando um novo objeto do tipo conta corrente
    ContaCorrente contaC = new ContaCorrente();

    // modificando os valores do atributos por meio dos metodos set
    contaC.setAgencia(1234);
    contaC.setNumero(1001);
    contaC.setCodCliente(10);
    contaC.setSaldo(100);
    
    //Acessando os valores atraves dos metodos get para impressao dos resutados
    System.out.println("========== CONTA CORRENTE ==========");
    System.out.println("-- CLIENTE: "+contaC.getCodCliente());
    System.out.printf("-- AGENCIA: %d || CONTA: %d\n",contaC.getAgencia(), contaC.getNumero());
    System.out.printf("-- SALDO: %.2f\n",contaC.getSaldo());
    System.out.println("====================================");
    }
}
