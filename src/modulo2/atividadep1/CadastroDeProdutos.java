package modulo2.atividadep1;

import java.util.Locale;
import java.util.Scanner;


public class CadastroDeProdutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("\t============== CADASTRO DE PRODUTOS ==============");
        System.out.println("\tBem vindo, adicione as informacoes do produto.");
        System.out.print("\tInforme o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("\tInforme a descrição do produto: ");
        String desc = sc.nextLine();
        System.out.print("\tInforme o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.print("\tInforme a categoria do produto: ");
        String categ = sc.next();
        System.out.println("\t--- PRODUTO CADASTRADO COM SUCESSO! ---");
        System.out.printf("\tProduto: %s | Descrição: %s | Valor: %.2f | Categoria: %s",nome,desc,valor,categ);

    }
}
