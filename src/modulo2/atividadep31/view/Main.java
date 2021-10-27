package view;

import java.util.Scanner;

import controller.CategoriaController;
import controller.ProdutoController;
import model.Categoria;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoriaController cc = new CategoriaController();
        ProdutoController pc = new ProdutoController();

        int opc = 0;

        do {
            imprimeMenu();
            opc = lerNumero("Informe uma opcao do menu: ", sc);
            executaMenu(opc, sc, cc, pc);

        } while (opc != 0);

    }

    private static int lerNumero(String msg, Scanner sc) {
        int numero = 0;
        boolean valido;

        do {
            // tratamento de excecao para permitir apenas numeros inteiros
            try {
                System.out.print(msg);
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.out.println("Valor informado é inválido!");
                valido = false;
            }
        } while (!valido);

        return numero;
    }

    private static void imprimeMenu() {
        System.out.println("========= SISTEMA DE CADASTRADO =========");
        System.out.println("1- CATEGORIAS \t2-PRODUTOS \t0-SAIR");
    }

    private static void imprimeMenuCRUD(String msg) {
        System.out.println("== Operacoes disponiveis");
        System.out.println(msg);
    }

    private static void executaMenu(int opc, Scanner sc, CategoriaController cc, ProdutoController pc) {

        switch (opc) {
        case 1:
            System.out.println("=== CATEGORIAS ===");
            imprimeMenuCRUD("1- CADASTRAR \t2- LISTAR \t3 - ATUALIZAR \t4- EXCLUIR \t5 - LISTAR PRODUTOS DE UMA CATEGORIA");
            executaCRUD(sc, cc, pc, opc);
            break;
        case 2:
            System.out.println("=== PRODUTOS ===");
            imprimeMenuCRUD("1- CADASTRAR \t2- LISTAR \t3 - ATUALIZAR \t4- EXCLUIR");
            executaCRUD(sc, cc, pc, opc);
            break;
        case 0:
            System.out.println("=== Saindo do sistema... ===");
            break;
        default:
            System.out.println("===== OPCAO INVALIDA =====");
            break;
        }
    }

    private static void executaCRUD(Scanner sc, CategoriaController cc, ProdutoController pc, int op) {
        int opcCRUD = lerNumero("informe a operacao desejada: ", sc);
        if (op == 1) {
            Categoria c;
            switch (opcCRUD) {
            case 1:
                System.out.println("CADASTRAR");
                c = lerCategoria(sc);
                cadastrar(c, pc, cc);
                break;
            case 2:
                System.out.println("LISTAR");
                c = new Categoria();
                listar(c, pc, cc);
                break;
            case 3:
                System.out.println("ATUALIZAR");
                int id = lerNumero("Informe o id da categoria a ser atualizada: ", sc);
                c = lerCategoria(sc);
                c.id = id;
                atualizar(c, pc, cc);
                break;
            case 4:
                System.out.println("EXCLUIR");
                c = new Categoria();
                c.id = lerNumero("Informe o id da categoria a ser atualizada: ", sc);
                // busca o objeto pois precisa verificar se tem produtos vinculados a ele
                c = cc.buscar(c);
                excluir(c, pc, cc);
                break;
            case 5:
                System.out.println("PRODUTOS DE UMA CATEGORIA");
                c = new Categoria();
                c.id = lerNumero("Informe o id da categoria a exibir os produtos vinculados: ", sc);
                // busca o objeto pois precisa verificar se tem produtos vinculados a ele
                c = cc.buscar(c);
                for (Produto p : c.produtos) {
                    System.out.printf("== ID: %d||\t == NOME: %s || \t: == VALOR: %.2f \n",p.id,p.nome,p.valor);
                }
                break;
            default:
                System.out.println("OPCAO INVALIDA!");
                break;
            }
        } else if (op == 2) {
            Produto p;
            switch (opcCRUD) {
            case 1:
                System.out.println("CADASTRAR");
                p = lerProduto(sc);
                cadastrar(p, pc, cc);
                break;
            case 2:
                System.out.println("LISTAR");
                p = new Produto();
                listar(p, pc, cc);
                break;
            case 3:
                System.out.println("ATUALIZAR");
                int id = lerNumero("Informe o id do produto a ser atualizado: ", sc);
                p = lerProduto(sc);
                p.id = id;
                atualizar(p, pc, cc);
                break;
            case 4:
                System.out.println("EXCLUIR");
                p = new Produto();
                p.id = lerNumero("Informe o id do produto a ser atualizado: ", sc);
                excluir(p, pc, cc);
                break;
            default:
                System.out.println("== OPCAO INVALIDA");
                break;
            }
        }
    }

    private static Produto lerProduto(Scanner sc) {
        Produto p = new Produto();
        Categoria c = new Categoria();
        p.categoria = c;
        System.out.print("Informe o nome do Produto: ");
        p.nome = sc.nextLine();
        boolean valido = false;
        do {
            try {
                System.out.print("Informe o valor do Produto: ");
                p.valor = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.out.println("O valor informado é inválido");
            }
        } while (!valido);

        valido = false;
        do {
            try {
                System.out.print("Informe o ID da categoria: ");
                p.categoria.id = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (NumberFormatException ex) {
                System.out.println("O valor informado é inválido");
            }
        } while (!valido);
        return p;
    }

    private static Categoria lerCategoria(Scanner sc) {
        Categoria c = new Categoria();
        System.out.print("Informe o nome da categoria: ");
        c.nome = sc.nextLine();
        System.out.print("Informe a descricao da categoria: ");
        c.descricao = sc.nextLine();
        return c;
    }

    private static void cadastrar(Object obj, ProdutoController pc, CategoriaController cc) {
        if (obj instanceof Produto) {
            Produto p = (Produto) obj;
            Categoria cat = new Categoria();
            cat.id = p.categoria.id;
            cat = cc.buscar(cat);
            if (cat == null) {
                System.out.println("Categoria não encontrada");
            } else {
                p.categoria = cat;
                pc.adicionar(p);
                // adiciona o produto na lista de produtos da categoria
                cc.adicionarProduto(cat, p);
            }
        } else if (obj instanceof Categoria) {
            Categoria c = (Categoria) obj;
            cc.adicionar(c);
        }
    }

    private static void listar(Object obj, ProdutoController pc, CategoriaController cc) {
        if(obj instanceof Produto){
            for (Produto p : pc.listar()) {
                System.out.println(p);
            }
        } else if(obj instanceof Categoria){
            for (Categoria c : cc.listar()) {
                System.out.println(c);
            }
        }
    }

    private static void atualizar(Object obj, ProdutoController pc, CategoriaController cc) {
        if (obj instanceof Produto) {
            Produto p = (Produto) obj;
            Categoria cat = new Categoria();
            cat.id = p.categoria.id;
            // busca se a categoria informada já está cadastrada
            cat = cc.buscar(cat);
            // se não tiver no sistema, mostra um erro
            if (cat == null) {
                System.out.println("Categoria não encontrada");
            } else {
                p.categoria = cat;
                pc.atualizar(p);
                // atualiza o produto na categoria
                cc.atualizarProduto(cat, p);
            }
        } else if (obj instanceof Categoria) {
            Categoria c = (Categoria) obj;
            // pega a copia do produto anterior
            Categoria cAnterior = cc.buscar(c);
            // passa a lista de produtos relacionados a categoria
            c.produtos = cAnterior.produtos;

            // atualiza os produtos com a categoria
            for (Produto p : c.produtos) {
                p.categoria = c;
                pc.atualizar(p);
            }

            // entao atualiza a categoria
            cc.atualizar(c);
        }
    }

    private static void excluir(Object obj, ProdutoController pc, CategoriaController cc) {
        if (obj instanceof Produto) {
            Produto p = (Produto) obj;
            p = pc.buscar(p);

            // Remocao do vinculo do produto com a categoria
            Categoria cat = new Categoria();
            cat.id = p.categoria.id;
            cat = cc.buscar(cat);
            cc.removerProduto(cat, p);

            // exclusao do produto
            pc.excluir(p);
        } else if(obj instanceof Categoria){
            Categoria c = (Categoria) obj;

            // cria uma categoria auxiliar pra pegar os dados e verificar se tem produtos vinculados a ele
            Categoria cat = new Categoria();
            cat.id = c.id;
            cat = cc.buscar(cat);
            c.produtos = cat.produtos;

            // só permite a exclusao se nao houver produtos vinculados a categoria
            if (c.produtos == null) {
                cc.excluir(c);
            } else{
                System.out.println("Categoria possui produtos vinculados");
            }
        }
    }
}
