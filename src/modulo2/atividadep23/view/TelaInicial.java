package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.LivroController;
import model.Livro;

public class TelaInicial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inicializando um objeto do tipo LivroController
        LivroController livros = new LivroController();

        int op = 0;
        do {
            menu();
            System.out.print("Digite a opcão desejada: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    cadastrar(livros, sc);
                    break;
                case 2:
                    listar(livros);
                    break;
                case 3:
                    atualizar(livros, sc);
                    break;
                case 4:
                    excluir(livros, sc);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println(" -- OPÇÃO INVÁLIDA! -- \n Digite novamente.");
            }

        } while (op != 0);

        sc.close();
    }

    public static void menu() {
        System.out.println("*********** LIVRARIA ***********");
        System.out.println(
                "\t1- CADASTRAR LIVRO \n\t2- LISTAR LIVROS\n\t3- ATUALIZAR LIVRO\n\t4- DELETAR LIVRO\n\t0 - SAIR");
    }

    public static void cadastrar(LivroController livros, Scanner sc) {
        System.out.println("*********** CADASTRO DE LIVROS ***********");
        System.out.print("Informe o título do livro: ");
        String titulo = sc.nextLine();
        System.out.print("Informe o autor do livro: ");
        String autor = sc.nextLine();
        System.out.print("Informe a editora do livro: ");
        String editora = sc.nextLine();

        // inicializa um novo livro, gerando um id aleatorio
        Livro liv = new Livro(titulo, autor, editora);

        // usa o metodo do controller para adicionar o objeto a lista
        livros.salvar(liv);

        System.out.println("\n\n LIVRO CADASTRADO! \n\n");
    }

    public static void listar(LivroController livros) {
        System.out.println("*********** LISTA DE LIVROS ***********");
        // recebe a lista a partir do metodo do controler
        ArrayList<Livro> listagem = livros.listar();

        // faz o laco para impressao dos dados dos livros da lista
        for (Livro livro : listagem) {
            System.out.println();
            System.out.println("== CÓDIGO: " + livro.getId());
            System.out.println("== TÍTULO: " + livro.getTitulo());
            System.out.println("== AUTOR: " + livro.getAutor());
            System.out.println("== EDITORA: " + livro.getEditora());
            System.out.println("-----------------------------------");
            System.out.println();
        }
        System.out.println("\n\n FIM DA LISTA DE LIVROS! \n\n");
    }

    public static void atualizar(LivroController livros, Scanner sc) {
        Livro liv = null;
        do {
            System.out.println("*********** ATUALIZAÇÃO DE LIVROS ***********");
            System.out.print("Informe o código do livro a ser atualizado: ");
            int id = Integer.parseInt(sc.nextLine());

            // se o id for valido, entao ele pede as informacoes para atualizacao
            if (livros.encontrarLivro(id) != null) {
                System.out.print("Informe o título do livro: ");
                String titulo = sc.nextLine();
                System.out.print("Informe o autor do livro: ");
                String autor = sc.nextLine();
                System.out.print("Informe a editora do livro: ");
                String editora = sc.nextLine();

                // inicializa o objeto livro já existente, informando o id
                liv = new Livro(id, titulo, autor, editora);

                // usa o metodo do controller para atualizar o objeto na lista
                livros.atualizar(liv);
                System.out.println("\n\n LIVRO ATUALIZADO! \n\n");
            } else {
                System.out.println(" O código informado é inválido!");
            }
        } while (liv == null); // enquanto nao informar um código válido pra atualizar ele repete o codigo
    }

    public static void excluir(LivroController livros, Scanner sc) {
        Livro liv = null;
        do {
            System.out.println("*********** DELETAR LIVROS ***********");
            System.out.print("Informe o código do livro a ser deletado: ");
            int id = Integer.parseInt(sc.nextLine());
            // passando o id o metodo retorna o livro da lista a ser deletado
            liv = livros.encontrarLivro(id);
            // se o objeto retornado não for nulo
            if (liv != null) {
                // usa o metodo do controller para remover o objeto na lista
                livros.deletar(liv);
                
                System.out.println("\n\n LIVRO DELETADO! \n\n");
            } else {
                System.out.println(" O código informado é inválido!");
            }
        } while (liv == null); // enquanto nao informar um código válido pra deletar ele repete o codigo
    }

}
