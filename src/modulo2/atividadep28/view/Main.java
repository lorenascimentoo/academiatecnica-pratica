package view;

import controller.ControllerPF;
import controller.ControllerPJ;
import model.Endereco;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        // inicializa o controller do tipo PessoaFisica
        ControllerPF pfController = new ControllerPF();

        // inicializa o controller do tipo PessoaJuridica
        ControllerPJ pjController = new ControllerPJ();

        // inicializando um objeto do tipo pessoaFisica
        PessoaFisica p1 = new PessoaFisica(1);
        // insere os dados na lista
        cadastrarDados("Daniel Hardman", "daiusdhaisudh",5, "22222222222", p1, pfController);

        // inicializando um objeto do tipo pessoaFisica
        PessoaFisica p2 = new PessoaFisica(1);
        // teste de insercao de dados na lista com o mesmo id
        cadastrarDados("Jessica Pearson", "uadhsuadhiuasd",3, "11111111111", p2, pfController);
        
        // inicializando um objeto do tipo pessoaFisica
        PessoaFisica p3 = new PessoaFisica(2);
        cadastrarDados("Harvey Specter", "endereco bla bla",10, "33333333333", p3, pfController);       
        
        System.out.println("LISTA INSERINDO O MESMO ID");
        // mostra os objetos da lista
        exibirDados(pfController);
        System.out.println("**********");
        System.out.println();

        System.out.println("LISTA DE ATUALIZACAO DOS DADOS DO ID");
        // atualiza os dados na lista
        atualizarDados("Jessica Pearson", "uadhsuadhiuasd",12, "11111111111", p2, pfController);
        exibirDados(pfController);
        System.out.println("**********");
        System.out.println();

        System.out.println("LISTA DE DELECAO DOS DADOS");
        // exclui o objeto na lista
        excluirDados(p3, pfController);
        exibirDados(pfController);
        System.out.println("**********");
        System.out.println();

        // inicializando um objeto do tipo pessoaJuridica
        PessoaJuridica pj1 = new PessoaJuridica(1);
        cadastrarDados("PEARSON HARDMAN", "endereco 1",320, "11223344", pj1, pjController);
        // inicializando um objeto do tipo pessoaJuridica
        PessoaJuridica pj2 = new PessoaJuridica(2);
        cadastrarDados("VIRGIN RIVER", "endereco 2",124, "55667788", pj2, pjController);
        // inicializando um objeto do tipo pessoaJuridica
        PessoaJuridica pj3 = new PessoaJuridica(3);
        cadastrarDados("RESTAURANTE BLA BLA", "endereco 3",1025, "99110022", pj3, pjController);
        
        System.out.println("LISTA APÓS TODOS OS CADASTROS");
        // mostra os objetos da lista
        exibirDados(pjController);
        System.out.println("**********");
        System.out.println();

        // inicializando um objeto do tipo pessoaJuridica com mesmo id
        PessoaJuridica pj4 = new PessoaJuridica(2);
        System.out.println("LISTA INSERINDO O MESMO ID");
        // teste de insercao de dados na lista com o mesmo id
        cadastrarDados("Atualizando nome", "atualizando endereco",1478, "att identicador", pj4, pjController);
        exibirDados(pjController);
        System.out.println("**********");
        System.out.println();

        System.out.println("LISTA ATUALIZANDO DADOS DO ID");
        // atualiza os dados na lista
        atualizarDados("Atualizando nome", "atualizando endereco",1478, "att identicador", pj4, pjController);
        exibirDados(pjController);
        System.out.println("**********");
        System.out.println();

        System.out.println("LISTA DELECAO DE DADOS");
        // exclui o objeto na lista
        excluirDados(pj3, pjController);
        exibirDados(pjController);
        System.out.println("**********");
        System.out.println();
        
    }

    // metodo para inserir dados as listas
    // recebe as informacoes a serem cadastradas
    // obj, recebe um objeto que sera cadastrado, pode ser PF ou PJ
    // controller, recebe um objeto que sera transformado em controlador PF ou PJ
    public static void cadastrarDados(String nome, String logradouro, int numero, String identicador, Object obj, Object controller){
        // cria um objeto de endereco a ser atribuido
        Endereco end = new Endereco();
        // atribui os valores ao objeto
        end.logradouro = logradouro;
        end.numero = numero;

        // verifica se e uma instancia de pessoa fisica
        if( obj instanceof PessoaFisica){
            // converte o obj em pessoa fisica
            PessoaFisica p = (PessoaFisica) obj;
            // atribui os valores ao atributo
            p.nome = nome;
            // end é o endereco inicializado na inicio do metodo
            p.endereco = end;
            p.cpf = identicador;

            // converte o controller em um controllerPF
            ControllerPF c = (ControllerPF) controller;
            
            // chama o metodo que adiciona um objeto a lista passando o objeto pessoaF
            c.adicionar(p);
        
        // se nao, caso seja uma instancia de pessoa juridica
        } else if( obj instanceof PessoaJuridica){

            // faz tudo de maneira analoga ao pessoaf

            PessoaJuridica p = (PessoaJuridica) obj;
            p.nome = nome;
            p.endereco = end;
            p.cnpj = identicador;

            ControllerPJ c = (ControllerPJ) controller;
            c.adicionar(p);
        }
    }

    // metodo para atualizar dados na lista
    // recebe as informacoes a serem atualizadas
    // obj, recebe um objeto que sera cadastrado, pode ser PF ou PJ
    // controller, recebe um objeto que sera transformado em controlador PF ou PJ
    public static void atualizarDados(String nome, String logradouro, int numero, String identicador,Object obj, Object controller){
        // cria um objeto de endereco a ser atribuido
        Endereco end = new Endereco();
        // atribui os valores ao objeto
        end.logradouro = logradouro;
        end.numero = numero;

        // FUNCIONA DE MANEIRA ANALOGA AO METODO adicionarDados()
        if( obj instanceof PessoaFisica){

            PessoaFisica p = (PessoaFisica) obj;
            p.nome = nome;
            p.endereco = end;
            p.cpf = identicador;

            ControllerPF c = (ControllerPF) controller;
            // chama o metodo que atualiza o objeto na lista, passando o ojeto pessoaF
            c.atualizar(p);

        } else if( obj instanceof PessoaJuridica){
            PessoaJuridica p = (PessoaJuridica) obj;
            p.nome = nome;
            p.endereco = end;
            p.cnpj = identicador;
            ControllerPJ c = (ControllerPJ) controller;
            c.atualizar(p);
        }
    }

    // metodo para remover dados na lista
    // obj, recebe um objeto que sera removido, pode ser PF ou PJ
    // controller, recebe um objeto que sera transformado em controlador PF ou PJ
    public static void excluirDados(Object obj, Object controller){
        // verifica se e uma instancia de pessoa fisica
        if( obj instanceof PessoaFisica){
            // converte o obj em pessoaF
            PessoaFisica p = (PessoaFisica) obj;
            // converte o controller em um controllerPF
            ControllerPF c = (ControllerPF) controller;

            // chama o metodo que remove o objeto na lista, passando o ojeto pessoaF
            c.deletar(p);

        } else if( obj instanceof PessoaJuridica){
            // faz tudo de maneira analoga ao pf
            PessoaJuridica p = (PessoaJuridica) obj;
            ControllerPJ c = (ControllerPJ) controller;
            c.deletar(p);
        }
    }

    // metodo para exibir os dados na lista
    // controller, recebe um objeto que sera transformado em controlador PF ou PJ
    public static void exibirDados(Object controller){
        // verifica se e uma instancia de pessoa fisica
        if(controller instanceof ControllerPF){
            // converte o controller em um controllerPF
            ControllerPF c = (ControllerPF) controller;
            
            //percorre uma lista do tipo pessoaF dos dados retornados atraves do metodo do controller
            for (PessoaFisica pf : c.listar()) {
                System.out.println(pf);
            }
        }else if(controller instanceof ControllerPJ){
            // faz tudo de maneira analoga ao pf
            ControllerPJ c = (ControllerPJ) controller;
            for (PessoaJuridica pj : c.listar()) {
                System.out.println(pj);
            }
        }
    }
}
