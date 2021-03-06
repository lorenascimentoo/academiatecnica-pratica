import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opc=-1;

        do{
            menu();
            opc = lerNumero(sc, "Informe a operacao desejada: ");
            int n1=0,n2=0;
            if(opc>0 && opc < 5){
                n1 = lerNumero(sc, "Digite o primeiro numero inteiro: ");
                n2 = lerNumero(sc, "Digite o segundo numero inteiro: ");
            }
            switch (opc) {
                case 1:
                    System.out.printf("A soma dos numeros %d e %d é: %d\n",n1,n2, calc.somar(n1, n2));
                    break;
                case 2:
                    System.out.printf("A subtracao dos numeros %d e %d é: %d\n",n1,n2, calc.subtrair(n1, n2));
                    break;
                case 3:
                    System.out.printf("A multiplicacao dos numeros %d e %d é: %d\n",n1,n2, calc.multiplicar(n1, n2));
                    break;
                case 4:
                    // implementacao do bloco try/cath para tratamento de excecoes
                    try{
                        System.out.printf("A divisao dos numeros %d e %d é: %d\n",n1,n2, calc.dividir(n1, n2));
                    } catch(ArithmeticException ex){
                        System.out.println("Não é possível realizar divisao por zero");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção informada é inválida!");
                    break;
            }
        }while(opc!=0);
    }

    public static void menu(){
        System.out.println("***** CALCULADORA *****");
        System.out.println("1- SOMA \t2-SUBTRACAO \t3-MULTIPLICACAO \t4-DIVISAO \t0-SAIR");
    }

    public static int lerNumero(Scanner sc, String msg){
        int numero = 0;
        boolean valido = false;
        do{
            try{
                System.out.print(msg);
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch(NumberFormatException ex){
                System.out.println("Valor informado é inválido!");
            }
        } while(!valido);
        
        return numero;
    }

}
