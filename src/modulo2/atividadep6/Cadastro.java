package modulo2.atividadep6;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== CADASTRO ===============");
        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = sc.nextLine();

        int count=0;
        while (count<10){
            System.out.printf("Nome: %s\n",nome);
            count++;
        }

        System.out.println("");

        for(int i=0; i<10;i++){
            System.out.printf("Sobrenome: %s\n",sobrenome);
        }
    }
}
