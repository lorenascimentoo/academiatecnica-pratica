public class Universidade {
    
    public static void main(String[] args) {
        // Criando uma instancia de um objeto do tipo funcionario
        Funcionario f = new Funcionario();
        // Criando uma instancia de um objeto do tipo coordenador
        Coordenador c = new Coordenador();
        // Criando uma instancia de um objeto do tipo Aluno
        Aluno a = new Aluno();

        // Utilizando os metodos setters para atribuir valores ao objeto FUNCIONARIO
        // atributos herdados da classe pessoa
        f.setNome("William");
        f.setSobrenome("Patterson");
        f.setMatricula(1020);
        // atributos da propria classe funcionario
        f.setDepartamento("TI");
        f.setSalario(13859.56);

        // Utilizando os metodos setters para atribuir valores ao objeto COORDENADOR
        // uma vez que herda da classe funcionario, consequentemente, herda também os atributos da classe pessoa
        c.setNome("Kurt");
        c.setSobrenome("Weller");
        c.setMatricula(0020);
        // atributos herdados da classe funcionario
        c.setDepartamento("Gerencia");
        c.setSalario(24500.99);
        // atributos da propria classe coordenador
        c.setBonus(10);
        c.setCurso_coordenado("Lógica de Programacão");

        // Utilizando os metodos setters para atribuir valores ao objeto aluno
        // atributos herdados da classe pessoa
        a.setNome("Jane");
        a.setSobrenome("Doe");
        a.setMatricula(0010);
        // atributos da propria classe aluno
        a.setCurso("Java - Orientação a Objetos");
        a.setTurma("A");
    }
}
