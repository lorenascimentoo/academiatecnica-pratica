package modulo2.atividadep6;

public class CalculoDeNumerosPrimos {
    public static void main(String[] args) {

        //varre o numero até o máximo definido
        for (int numero = 0; numero <= 150; numero++) {
            //inicia validacao do numero primo
            boolean valido = true;
            while (valido) {
                //numeros menores que dois não são primos
                if (numero < 2) {
                    valido = false;
                    //o dois é o primeiro numero primo
                } else if (numero == 2) {
                    System.out.printf("Este numero e primo! Numero: %d \n", numero);
                    valido = false;
                } else {
                    //variavel que indica o numero primo e que permite a impressao do numero em tela
                    boolean primo = true;
                    //varredura de todos os numeros a partir de 2 ate o numero anterior ao numero testado
                    for (int cont= 2; cont <numero;cont++){
                        // se o numero for divisivel por qualquer numero, ele deixa de ser primo
                        // nega a variavel primo(que permite a impressao na tela, sai do laco for
                        // e nega a validade do numero quebrando o laco de validacao do numero
                        if(numero%cont == 0){
                            valido = false;
                            primo = false;
                            break;
                        }
                    }

                    //se apos a leitura do laco 'for' nao for encontrado nenhum divisor para o numero, entao ele e primo
                    if (primo){
                        System.out.printf("Este numero e primo! Numero: %d \n", numero);
                        valido = false;
                    }
                }

            }
        }
    }

}

