package P1.model;

public class Empresa {

    public String nome;
    public String cnpj;
    public String ramo_atividade;

    @Override
    public String toString() {
        String retorno = String.format("%s;%s;%s\n", this.nome,this.cnpj,this.ramo_atividade);
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Empresa) {
            Empresa compara = (Empresa) obj;

            if (this.cnpj.equals(compara.cnpj)) {
                return true;
            }
        }
        return false;
    }
}