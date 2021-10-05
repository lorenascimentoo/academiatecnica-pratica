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
        c.setMatricula(1220);
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
        a.setMatricula(10);
        // atributos da propria classe aluno
        a.setCurso("Java - Orientação a Objetos");
        a.setTurma("A");

        //IMPRESSAO DOS DADOS

        //utilizado os metodos getter para impressao dos dados do objeto FUNCIONARIO
        System.out.println("===== DADOS DO FUNCIONARIO =====");
        //chama o metodo usado para impressao dos dados contidos na classe pessoa
        // passando os valores dos metodos getters dos atributos
        imprimirDadosPessoais(f.getNome(), f.getSobrenome(), f.getMatricula());
        // chama o metodo usado para impressao dos dados contidos na classe funcionario
        imprimirDadosFuncionario(f.getSalario(), f.getDepartamento());
        System.out.println("================================");
        System.out.println();

        //utilizado os metodos getter para impressao dos dados do objeto COORDENADOR
        System.out.println("===== DADOS DO COORDENADOR =====");
        //chama o metodo usado para impressao dos dados contidos na classe pessoa
        // passando os valores dos metodos getters dos atributos
        imprimirDadosPessoais(c.getNome(), c.getSobrenome(), c.getMatricula());
        // chama o metodo usado para impressao dos dados contidos na classe funcionario
        imprimirDadosFuncionario(c.getSalario(), c.getDepartamento());
        System.out.println("Curso coordenado: "+c.getCurso_coordenado());
        System.out.println("Bonus: "+c.getBonus());
        System.out.println("================================");
        System.out.println();

        //utilizado os metodos getter para impressao dos dados do objeto ALUNO
        System.out.println("===== DADOS DO ALUNO =====");
        // chama o metodo usado para impressao dos dados contidos na classe pessoa
        // passando os valores dos metodos getters dos atributos
        imprimirDadosPessoais(a.getNome(), a.getSobrenome(), a.getMatricula());
        System.out.println("Curso: "+a.getCurso());
        System.out.println("Turma: "+a.getTurma());
        System.out.println("================================");

    }

    // metodo usado para impressao dos dados da classe pessoa
    public static void imprimirDadosPessoais(String nome, String sobrenome, int matricula){
        System.out.println("Nome: "+nome);
        System.out.println("Sobrenome: "+sobrenome);
        System.out.println("Matrícula: "+matricula);
    }

    // metodo usado para impressao dos dados da classe funcionario
    public static void imprimirDadosFuncionario(double salario, String departamento){
        System.out.println("Salario: "+salario);
        System.out.println("Departamento: "+departamento);
    }
}
