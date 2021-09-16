package modulo2.atividadep5;

import java.util.Scanner;

public class CadastroDev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t=================== CADASTRO DEV ===================");
        System.out.println("\t -- Bem vindo, --");
        System.out.println("\tOpcoes disponiveis: \n 1- CADASTRAR DEV | 2 - CADASTRAR LINGUAGEM | 0 - SAIR");

        System.out.print("\tInsira a opcao desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine(); //efetua a leitura da quebra de linha após a leitura do inteiro

        boolean valido = true;

        switch (opcao){
            case 0:
                System.out.println("\tSaindo do programa...");
                break;
            case 1:
                System.out.println("\t========= CADASTRO DE DESENVOLVEDOR =========");
                String nome ="";
                String sobrenome = "";
                String senioridade = "";
                short idade = 0;

                do {
                    System.out.print("\tInforme o nome do dev: ");
                    nome = sc.nextLine();

                    if (nome.length() <3) {
                        System.out.println("\tO nome precisa conter no minimo 3 caracteres");
                    }
                }while(nome.length()<3);

                do {
                    System.out.print("\tInforme o sobrenome do dev: ");
                    sobrenome = sc.nextLine();

                    if (sobrenome.length() <3) {
                        System.out.println("\tO sobrenome precisa conter no minimo 3 caracteres");
                    }
                }while(sobrenome.length()<3);

                System.out.println("\tOPÇÕES SENIORIDADE: 1- JUNIOR | 2 - PLENO | 3 - SENIOR");
                valido = true;
                do {
                    System.out.print("\tInforme a opcao de senioridade");
                    int opS = sc.nextInt();
                    sc.nextLine();

                    switch (opS) {
                        case 1:
                            senioridade = "JUNIOR";
                            valido = false;
                            break;
                        case 2:
                            senioridade = "PLENO";
                            valido = false;
                            break;
                        case 3:
                            senioridade = "SENIOR";
                            valido = false;
                            break;
                        default:
                            System.out.println("\t -- OPÇÃO INVALIDA --");
                    }
                } while (valido);

                do {
                    System.out.print("\tInforme a idade do dev: ");
                    idade = sc.nextShort();

                    if (idade <=0) {
                        System.out.println("\tIdade inválida, não é permitida idade menor que zero");
                    }
                }while(idade <=0);

                System.out.println("\t --- DESENVOLVEDOR CADASTRADO COM SUCESSO --- ");
                System.out.printf("\t == Usuario: %s \t == Sobrenome: %s \t == SENIORIDADE: %s \t == IDADE: %d",nome,sobrenome,senioridade,idade);
                break;
            case 2:
                System.out.println("\t========= CADASTRO DE LINGUAGEM =========");
                String nomeL ="";
                String aplicacao = "";

                do {
                    System.out.print("\tInforme o nome da linguagem: ");
                    nomeL = sc.nextLine();

                    if (nomeL.length() <3) {
                        System.out.println("\tO nome da linguagem precisa conter no minimo 3 caracteres");
                    }
                } while (nomeL.length()<3);

                System.out.print("\tInforme a descricao da linguagem: ");
                String descricao = sc.nextLine();

                System.out.println("\tOPÇÕES APLICACAO: 1- FRONTEND | 2 - BACKEND | 3 - MOBILE");


                do {
                    System.out.print("\tInforme a opção de aplicacao");
                    int opA = sc.nextInt();
                    sc.nextLine();

                    switch (opA) {
                        case 1:
                            aplicacao = "FRONTEND";
                            valido = false;
                            break;
                        case 2:
                            aplicacao = "BACKEND";
                            valido = false;
                            break;
                        case 3:
                            aplicacao = "MOBILE";
                            valido = false;
                            break;
                        default:
                            System.out.println("\t -- OPÇÃO INVALIDA --");
                    }
                } while (valido);

                System.out.println("\t --- LINGUAGEM CADASTRADA COM SUCESSO --- ");
                System.out.printf("\t == NOME: %s \t == DESCRICAO: %s \t == APLICACAO: %s",nomeL,descricao,aplicacao);
                break;
            default:
                System.out.println("\t --- OPCAO INVALIDA ---");
                break;
        }
    }
}
