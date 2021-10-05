// coordenador herdando as carateristicas de funcionario
// em java a palavra reservada extends indica heranca
public class Coordenador extends Funcionario{
    // encapsulamento dos atributos com a palavra reservada private
    private String curso_coordenado;
    private double bonus;

    // METODOS PARA MODIFICACOES DOS ATRIBUTOS
    // - getters: usados para acessar os atributos
    // - setters: usados para atribuir valores aos atributos

    public void setCurso_coordenado(String curso_coordenado) {
        this.curso_coordenado = curso_coordenado;
    }
    public String getCurso_coordenado() {
        return curso_coordenado;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
}
