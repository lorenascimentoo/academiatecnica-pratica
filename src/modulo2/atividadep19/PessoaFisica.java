public class PessoaFisica {
    //encapsulamento dos atributos, tornando-os privados
    private int codigo;
    private String nome;
    private String sobrenome;
    private Byte idade;
    private String rg;
    private String cpf;

    //metodo de acesso ao atributo codigo
    public int getCodigo() {
        return codigo;
    }
    //metodo de modificacao do atributo codigo
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    //metodo de acesso ao atributo nome
    public String getNome() {
        return nome;
    }
    //metodo de modificacao do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //metodo de acesso ao atributo sobrenome
    public String getSobrenome() {
        return sobrenome;
    }
    //metodo de modificacao do atributo sobrenome
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    //metodo de acesso ao atributo idade
    public Byte getIdade() {
        return idade;
    }
    //metodo de modificacao do atributo idade
    public void setIdade(Byte idade) {
        this.idade = idade;
    }
    //metodo de acesso ao atributo rg
    public String getRg() {
        return rg;
    }
    //metodo de modificacao do atributo rg
    public void setRg(String rg) {
        this.rg = rg;
    }
    //metodo de acesso ao atributo cpf
    public String getCpf() {
        return cpf;
    }
    //metodo de modificacao do atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
