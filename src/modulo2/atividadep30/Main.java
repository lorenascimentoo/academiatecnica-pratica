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
            if(opc!=0){
                n1 = lerNumero(sc, "Digite o primeiro numero inteiro: ");
                n2 = lerNumero(sc, "Digite o segundo numero inteiro: ");
            }
            switch (opc) {
                case 1:
                    System.out.printf("A soma dos numeros %d e %d é: %d",n1,n2, calc.somar(n1, n2));
                    break;
                case 2:
                    System.out.printf("A subtracao dos numeros %d e %d é: %d",n1,n2, calc.subtrair(n1, n2));
                    break;
                case 3:
                    System.out.printf("A multiplicacao dos numeros %d e %d é: %d",n1,n2, calc.multiplicar(n1, n2));
                    break;
                case 4: 
                    System.out.printf("A divisao dos numeros %d e %d é: %d",n1,n2, calc.dividir(n1, n2));
                    break;
            }
        }while(opc!=0);
    }

    public static void menu(){
        System.out.println("***** CALCULADORA *****");
        System.out.println("1- SOMA \t2-SUBTRACAO \t3-MULTIPLICACAO \t4-DIVISAO \t0-SAIR");
    }

    public static int lerNumero(Scanner sc, String msg){
        System.out.print(msg);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

}
