package P1;

public class Aluno {
    //atributos da classe encapsulados
    private String nome_completo;
    private byte idade;
    private int matricula;

    // METODOS MODIFICADORES
    // getters para acesso dos atributos
    // setter para atribuicao de valores aos atributos

    public String getNome_completo() {
        return nome_completo;
    }
    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }

    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String atributos = "== Nome Completo: "+this.getNome_completo()+"\n"+" == Idade: " + this.getIdade()+"\n"+" == MATRICULA: " + this.getMatricula();
        return atributos;
    }
    
}