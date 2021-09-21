package modulo2.atividadep8;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    //O static torna a variável visivel em td escopo do codigo
    static Scanner sc =new Scanner(System.in);

    //metodo principal do programa
    public static void main(String[] args) {
        imprimeMensagem("\t=============== CALCULADORA ===============");

        // leitura dos valores
        double n1 = lerNumeros("Digite o primeiro numero: ");
        double n2 = lerNumeros("Digite o segundo numero: ");

        //Impressao dos resultados
        imprimeMensagem("\t===== CALCULO ENTRE OS NUMEROS INFORMADOS ====");
        System.out.printf("\t === N1 = %.2f | === N2 = %.2f\n\n",n1,n2);
        System.out.printf("\t == SOMA : %.2f \n",soma(n1,n2));
        System.out.printf("\t == SUBTRACAO : %.2f \n",subtracao(n1,n2));
        System.out.printf("\t == MULTIPLICACAO : %.2f \n",multiplicacao(n1,n2));
        System.out.printf("\t == DIVISAO : %.2f \n",divisao(n1,n2));

    }

    static void imprimeMensagem(String mensagem){
        System.out.println(mensagem);
    }

    //metodo que faz a leitura dos numeros
    static double lerNumeros(String mensagem){
        System.out.print(mensagem);
        double numero = sc.nextDouble();
        return numero;
    }

    // --- OPERACOES ---

    //metodo de soma
    static double soma(double n1, double n2){
        return n1+n2;
    }

    //metodo de subtracao
    static double subtracao(double n1, double n2){
        return n1-n2;
    }

    //metodo de multiplicacao
    static double multiplicacao(double n1, double n2){
        return n1*n2;
    }

    //metodo de divisao
    static double divisao(double n1, double n2){
        return n1/n2;
    }
}
