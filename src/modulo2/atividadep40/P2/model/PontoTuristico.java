package P2.model;

public class PontoTuristico{
    public String nome;
    public String descricao;
    public String localizacao;

    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s\n", this.nome,this.descricao,this.localizacao);
        return retorno;
    }
}
