// a classe aluno herda o comportamento da classe pessoa
public class Aluno extends Pessoa{
    public int matricula;
    public String turma;
    public String curso;

    @Override
    public boolean equals(Object obj) {
        // converte o object recebido em um objeto do tipo aluno
        Aluno aVerificado = (Aluno) obj;
        // verifica se todos os dados do objeto são iguais
        // as strings são verificadas pelo metodo equals da classe string
        // por herdar da classe pessoa, e necessario chamar o metodo da mae para verificar os dados herdados
        if(super.equals(aVerificado) && this.turma.equals(aVerificado.turma) && this.curso.equals(aVerificado.curso) && this.matricula == aVerificado.matricula){
            return true;
        }
        // caso nao seja igual retorna false
        return false;
    }

    @Override
    public String toString() {
        // dada a heranca, primeiro chama o metodo da classe mae (pessoa)
        // depois concatena com a string dos dados da classe aluno
        return super.toString()+"\n== MATRICULA: "+this.matricula+"\n== TURMA: "+this.turma+"\n== CURSO: "+this.curso;
    }
}
