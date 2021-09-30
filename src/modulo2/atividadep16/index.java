
public class index {

    public static void main(String[] args) {
        //criacao do objeto que realiza as exibicoes na tela e leitura de valores
        Acao exibe = new Acao();
        // criacao do objeto que calcula as taxas
        CalculadoraTaxas cT = new CalculadoraTaxas();

        //imprime o cabecalho
        exibe.cabecalho();

        // Criacao do primeiro objeto conta
        Conta c1 = new Conta();

        // Criacao do segundo objeto conta
        Conta c2 = new Conta();

        // variaveis que recebem os valores das taxas calculadas
        double taxaTransfC1, taxaSaqueC1 = 0.0;
        // variavel que vai guardar a opcao do usuario
        int opcao = -1;
        // variavel que vai guardar se o usuario quer realizar outra operacao
        boolean outraTransacao=false;
        
        // techo que obriga o codigo a ficar repetindo ate que o usuario coloque uma opcao valida
        // ou nao queria mais realizar uma operacao
        do {
            //imprime as opcoes de transacoes
            exibe.Menu();
            // faz a leitura da opcao do usuario
            opcao = (int) exibe.lerValor("Informe a opcao desejada: ");
            System.out.println(); //apenas pra melhorar a visualizacao
            // variavel que guarda o valor a ser feita a transacao
            double valor;

            switch (opcao) {
                case 1:
                    System.out.println("================== DEPOSITO =================\n");
                    //solicita o valor da transacao
                    valor = exibe.lerValor("Informe o valor: ");
                    //realiza o deposito na conta
                    c1.depositar(valor);
                    // exibe os dados da transacao
                    c1.imprimeTransacao("deposito", valor,0.0);
                    break;
                case 2:
                    System.out.println("================== SAQUE =================\n");
                    //solicita o valor da transacao
                    valor = exibe.lerValor("Informe o valor: ");
                    // realiza o saque
                    c1.sacar(10.0);
                    // calcula a taxa de saque
                    // o boolean do metodo c1.verificaLimiteSaque() indica se o usuario tem saldo e
                    // realiza o calculo da taxa
                    taxaSaqueC1 = cT.taxaSaque(c1.verificaLimiteSaque());
                    // realiza o desconto do valor da taxa no saldo da conta
                    c1.descontaTaxa(taxaSaqueC1);
                    // exibe os dados da transacao
                    c1.imprimeTransacao("saque",valor,taxaSaqueC1);
                    break;
                case 3:
                    System.out.println("================== TRANSFERENCIA =================\n");
                    //solicita o valor da transacao
                    valor = exibe.lerValor("Informe o valor: ");
                    // realiza a transferencia do objeto 1 para o objeto 2
                    // na logica desse programa, a transferencia também é um saque, logo é contabilizada
                    c1.transferir(valor, c2);
                    // calcula a taxa de transferencia
                    taxaTransfC1 = cT.taxaTransferencia(valor);
                    // realiza o desconto do valor da taxa no saldo da conta
                    c1.descontaTaxa(taxaTransfC1);
                    // exibe os dados da transacao
                    c1.imprimeTransacao("transferencia",valor,taxaTransfC1);
                    break;
                default:
                    System.out.println("-- Opcao invalida!");
                    break;
            }
            //se for uma das opcoes validas, inicia a validacao para fazer uma nova transacao
            if(opcao <4){
                outraTransacao = exibe.validaOutraTransacao();
            }
            System.out.println();
        } while(opcao>=4 || outraTransacao);

    }

}