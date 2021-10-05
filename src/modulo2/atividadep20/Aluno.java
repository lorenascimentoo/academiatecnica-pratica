// aluno herdando as carateristicas de pessoa
// em java a palavra reservada extends indica heranca
public class Aluno extends Pessoa{
    // encapsulamento dos atributos com a palavra reservada private
    private String curso;
    private String turma;

    // METODOS PARA MODIFICACOES DOS ATRIBUTOS
    // - getters: usados para acessar os atributos
    // - setters: usados para atribuir valores aos atributos
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getTurma() {
        return turma;
    }
}
