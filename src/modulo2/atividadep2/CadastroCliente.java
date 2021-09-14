package modulo2.atividadep2;

import java.util.Scanner;

public class CadastroCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t============ CADASTRO DE USUARIO ===================");
        System.out.println("\t -- Bem vindo ao Cadastro de usuario. --");

        System.out.print("\tInforme o nome do usuario: ");
        String nome = sc.nextLine();
        System.out.print("\tInforme o sobrenome do usuario: ");
        String sobrenome = sc.nextLine();
        System.out.print("\tInforme a idade do usuario: ");
        short idade = sc.nextShort();

        if (idade<18){
            System.out.println("");
            System.out.println("\t --- ERRO NO CADASTRO DO USUARIO --- ");
            System.out.println("\tO usuario não pode ser cadastrado devido sua idade.");
        } else{
            System.out.println("");
            System.out.println("\t --- USUARIO CADASTRADO COM SUCESSO --- ");
            System.out.printf("\t == Usuario: %s \n\t == Sobrenome: %s \n\t == Idade: %d ", nome,sobrenome,idade);
        }

    }

}
