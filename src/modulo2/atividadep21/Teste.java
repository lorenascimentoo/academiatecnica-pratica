public class Teste {
    public static void main(String[] args) {
        // inicializacao de um novo objeto do tipo Conta
        Conta c = new Conta();
        // utilizando os metodos setters para atribuicao dos valores dos atributos da classe conta
        c.setCod_cliente(1);
        c.setSaldo(100);
        // realizando uma transferencia no objeto do tipo conta
        c.transferencia(20);

        // inicializacao de um novo objeto do tipo Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        // por heranca, a classe conta corrente recebe os atributos da classe conta
        // utilizando os metodos setters para atribuicao dos valores dos atributos
        cc.setCod_cliente(2);
        cc.setSaldo(200);
        // realizando uma transferencia no objeto do tipo conta corrente
        c.transferencia(50);
    }
}
