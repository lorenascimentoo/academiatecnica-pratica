// funcionario herdando as carateristicas de pessoa
// em java a palavra reservada extends indica heranca
public class Funcionario extends Pessoa{
    // encapsulamento dos atributos com a palavra reservada private
    private double salario;
    private String departamento;

    // METODOS PARA MODIFICACOES DOS ATRIBUTOS
    // - getters: usados para acessar os atributos
    // - setters: usados para atribuir valores aos atributos

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }
}
