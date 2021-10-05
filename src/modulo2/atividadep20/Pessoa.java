
public class Pessoa {
    // encapsulamento dos atributos com a palavra reservada private
    private String nome;
    private String sobrenome;
    private int matricula;

    // METODOS PARA MODIFICACOES DOS ATRIBUTOS
    // - getters: usados para acessar os atributos
    // - setters: usados para atribuir valores aos atributos
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }
}