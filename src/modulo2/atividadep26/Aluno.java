// a classe aluno herda o comportamento da classe pessoa
public class Aluno extends Pessoa{
    public String matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        // converte o object recebido em um objeto do tipo aluno
        Aluno aVerificado = (Aluno) obj;
        // verifica se todos os dados do objeto são iguais
        // as strings são verificadas pelo metodo equals da classe string
        // por herdar da classe pessoa, e necessario chamar o metodo da mae para verificar os dados herdados
        if(super.equals(aVerificado) && this.matricula.equals(aVerificado.matricula) && this.turma.equals(aVerificado.turma) && this.curso.equals(aVerificado.curso)){
            return true;
        }
        // caso nao seja igual retorna false
        return false;
    }
}
