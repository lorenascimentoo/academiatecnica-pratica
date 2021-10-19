public class Main {
    public static void main(String[] args) {
        // instanciando um objeto do tipo pessoa
        Pessoa p1 = new Pessoa();
        // atribuindo os valores ao objeto pessoa
        p1.nome = "Mel";
        p1.sobrenome="Moonroe";
        p1.idade=30;

        // instanciando um objeto do tipo pessoa
        Aluno a1 = new Aluno();
        // atribuindo os valores ao objeto aluno herdados da classe pessoa
        a1.nome="Jack";
        a1.sobrenome="Sheridan";
        a1.idade=35;
        // atribuindo os valores ao objeto aluno
        a1.matricula=20;
        a1.turma="A";
        a1.curso="Gastronomia";

        // instanciando um objeto do tipo dado
        Dados listaDados = new Dados();
        // adicionando o objeto pessoa ao array de dados
        listaDados.add(p1);
        // adicionando o objeto aluno ao array de dados
        listaDados.add(a1);
    }
}
