package modulo2.atividadep2;

import java.util.Scanner;

public class CadastroFSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\t===================== CADASTRO =====================");
        System.out.println("\t -- Bem vindo, ao cadastro de arquivos na secao de entretenimento. --");
        System.out.println("\tOpcoes disponiveis: \n 1- FILMES | 2 - SERIES | 3 - DOCUMENTARIOS | 0 - SAIR");

        System.out.print("\tInsira a opção desejada: ");
        int opcao = sc.nextInt();
        sc.nextLine(); //efetua a leitura da quebra de linha após a leitura do inteiro

        switch(opcao){
            case 0:
                System.out.println("Saindo do sistema...");
                break;
            case 1:
                System.out.println(" -- CADASTRO DE FILMES --");
                System.out.print("\tInforme o nome do filme: ");
                String nomeF = sc.nextLine();
                System.out.print("\tInforme a descricao do filme: ");
                String descricaoF = sc.nextLine();
                System.out.print("\tInforme o genero do filme: ");
                String generoF = sc.nextLine();
                System.out.print("\tInforme o ano de lancamento do filme: ");
                int anoLancamentoF = sc.nextInt();

                System.out.println("--- FILME CADASTRADO COM SUCESSO! ---");
                System.out.printf("\tFilme: %s | Descricao: %s | Genero: %s | Ano de Lancamento: %d",nomeF,descricaoF,generoF,anoLancamentoF);
                break;
            case 2:
                System.out.println(" -- CADASTRO DE SERIES --");
                System.out.print("\tInforme o nome da serie: ");
                String nomeS = sc.nextLine();
                System.out.print("\tInforme a produtora da serie: ");
                String produtoraS = sc.nextLine();
                System.out.print("\tInforme o ano de lancamento da serie: ");
                int anoLancamentoS = sc.nextInt();

                System.out.println("--- SERIE CADASTRADA COM SUCESSO! ---");
                System.out.printf("\tSerie: %s | Produtora: %s | Ano de Lancamento: %d",nomeS,produtoraS,anoLancamentoS);
                break;
            case 3:
                System.out.println(" -- CADASTRO DE DOCUMENTARIO --");
                System.out.print("\tInforme o nome do documentario: ");
                String nomeD = sc.nextLine();
                System.out.print("\tInforme o tema do documentario: ");
                String temaD = sc.nextLine();
                System.out.print("\tInforme o ano de lancamento do documentario: ");
                int anoLancamentoD = sc.nextInt();

                System.out.println("--- DOCUMENTARIO CADASTRADO COM SUCESSO! ---");
                System.out.printf("\tDocumentario: %s | Tema: %s | Ano de Lancamento: %d",nomeD,temaD,anoLancamentoD);
                break;
            default:
                System.out.println("\t--- OPÇÃO INVÁLIDA ---");
                break;
        }
    }
}
