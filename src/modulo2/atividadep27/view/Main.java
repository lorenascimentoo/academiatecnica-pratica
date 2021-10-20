package view;

import controller.FilmeController;
import controller.SerieController;
import model.Filme;
import model.Serie;

public class Main {
    public static void main(String[] args) {
        // Criando um controller de Filme
        FilmeController fc = new FilmeController();

        // criando um objeto filme
        Filme f1 = new Filme();
        // atribuindo os valores do objeto
        f1.nacionalidade = "Brasileira";
        f1.distribuidor = "Globo Filmes";
        f1.sinopse= "uhsauhsiuas";
        f1.titulo = "soasksihdakajs";
        f1.anoLancamento = "2020";
        f1.tipo="comedia";

        //adicao de um objeto a lista por meio do metodo do controller
        fc.adicionar(f1);
        
        // criando um objeto filme
        Filme f2 = new Filme();
        // atribuindo os valores do objeto
        f2.nacionalidade = "Brasileira";
        f2.distribuidor = "Globo Filmes";
        f2.sinopse= "uhsauhsiuas";
        f2.titulo = "soasksihdakajs 2";
        f2.anoLancamento = "2021";
        f2.tipo="comedia";

        // criando um objeto filme
        Filme f3 = new Filme();
        // atribuindo os valores do objeto
        f3.id = f2.id;
        f3.nacionalidade = "Brasileira";
        f3.distribuidor = "Globo Filmes";
        f3.sinopse= "uhsauhsiuas";
        f3.titulo = "soasksihdakajs 3";
        f3.anoLancamento = "2022";
        f3.tipo="comedia";

        fc.adicionar(f2);
        // teste de adicao de um objeto já existente
        fc.adicionar(f3);
        System.out.println("Listagem 1");
        for (Filme filme : fc.listar()) {
            System.out.println(filme);
        }
        System.out.println();

        System.out.println("Listagem de atualizacao");
        //teste de atualizacao de um objeto
        fc.atualizar(f3);
        for (Filme filme : fc.listar()) {
            System.out.println(filme);
        }
        
        System.out.println();
        System.out.println("Listagem de delecao");
        //teste de remocao de um objeto
        fc.deletar(f1);
        for (Filme filme : fc.listar()) {
            System.out.println(filme);
        }

        // Criando um controller de Serie
        SerieController sc = new SerieController();

        Serie s1 = new Serie();
        s1.titulo = "Suits";
        s1.sinopse = "bla bala bla";
        s1.anoLancamento = "2011";
        s1.quant_temporadas=9;
        s1.quant_episodios = 134;
        s1.tipo = "Drama";
        s1.autor = "Korsh";
        s1.finalizada = true;

        sc.adicionar(s1);

        Serie s2 = new Serie();
        s2.id = s1.id;
        s2.titulo = "Suits";
        s2.sinopse = "bla bala bla";
        s2.anoLancamento = "2011";
        s2.quant_temporadas=9;
        s2.quant_episodios = 134;
        s2.tipo = "Drama";
        s2.autor = "Aron Korsh";
        s2.finalizada = true;

        sc.adicionar(s2);
        sc.atualizar(s2);

        Serie s3 = new Serie();
        s3.titulo = "Blindspot";
        s3.sinopse = "bla bala bla";
        s3.anoLancamento = "2015";
        s3.quant_temporadas=5;
        s3.quant_episodios = 100;
        s3.tipo = "Ação";
        s3.autor = "Martin Gero";
        s3.finalizada = true;

        sc.adicionar(s3);
        sc.deletar(s2);
        System.out.println(" Lista de series ");
        for (Serie serie : sc.listar()) {
            System.out.println(serie);
        }
    }
}
