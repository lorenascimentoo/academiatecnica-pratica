public class Dados {
    private Object[] dados;
    private int posicao;

    public Dados(){
        this.dados = new Dados[5];
    }

    // metodo para adicionar dados ao array
    // recebe um tipo object para aceitar qualquer tipo de objeto
    public void add(Object obj){

        // verifica se ainda há espaco para adicao ao array
        if(posicao < this.dados.length){
            // caso tenha, ele adiciona o objeto a posicao do array
            this.dados[posicao] = obj;
        // caso nao haja espaço
        } else {
            // instancia um novo objeto com o dobro do espaço
            Object[] maisDados = new Object[this.dados.length+5];

            //adiciona todos os dados já existentes no vetor anterior ao novo vetor com o dobro de espaco
            for(int i=0; i<this.dados.length; i++){
                maisDados[i] = this.dados[i];
            }

            // após o backup dos dados, adiciona o obj a posicao - agora existente
            maisDados[posicao] = obj;

            // com os dados atualizados, o novo vetor é atribuido ao vetor da classe, tendo um novo espaco em memoria e maior valor 
            this.dados = maisDados;
        }
    }
}
