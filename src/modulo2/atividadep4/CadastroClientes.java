package modulo2.atividadep4;

import java.util.Scanner;

public class CadastroClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t============ CADASTRO DE CLIENTES ===================");
        System.out.println("\t -- Bem vindo ao Cadastro de cliente. --");
        System.out.println("\tOpcoes disponiveis: \n 1- CADASTRAR CLIENTE | 2 - LISTAR CLIENTE | 0 - SAIR");

        System.out.print("\tInsira a opcao desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine(); //efetua a leitura da quebra de linha após a leitura do inteiro

        String nome = "";
        String sobrenome = "";
        String rg ="";
        String cpf = "";

        switch (opcao){
            case 0 :
                System.out.println("Saindo...");
                break;
            case 1 :
                System.out.println("\t============ CADASTRO DE CLIENTES ===================");

                do {
                    System.out.print("Informe o nome do cliente: ");
                    nome = sc.nextLine();
                    if (nome.length()<3){
                        System.out.print("Quantidade de caracteres não obedece ao mínimo requerido!");
                        System.out.println(" Informe no minimo 3 caracteres.");
                    }
                } while(nome.length()<3);

                do {
                    System.out.print("Informe o sobrenome do cliente: ");
                    sobrenome = sc.nextLine();
                    if (sobrenome.length()<3){
                        System.out.print("Quantidade de caracteres não obedece ao mínimo requerido!");
                        System.out.println(" Informe no minimo 3 caracteres.");
                    }
                } while(sobrenome.length()<3);

                do {
                    System.out.print("Informe o RG do cliente: ");
                    rg = sc.nextLine();
                    if (rg.length()<4){
                        System.out.print("Quantidade de caracteres não obedece ao mínimo requerido!");
                        System.out.println(" Informe no minimo 4 caracteres.");
                    }
                } while(rg.length()<4);

                do {
                    System.out.print("Informe o CPF do cliente: ");
                    cpf = sc.nextLine();
                    if (cpf.length()<11){
                        System.out.print("Quantidade de caracteres não obedece ao mínimo requerido!");
                        System.out.println(" Informe 11 caracteres.");
                    }
                } while(cpf.length()<11);
                break;
            case 2 :
                System.out.println("Carregando lista de clientes...");
                break;
            default:
                System.out.println(" --- OPCAO INVALIDA ---");
        }

        if (opcao ==1){
            System.out.println("\t --- CLIENTE CADASTRADO COM SUCESSO --- ");
            System.out.printf("\t == Usuario: %s \t == Sobrenome: %s \t == RG: %s \t == CPF: %s",nome,sobrenome,rg,cpf);
        }


    }
}
