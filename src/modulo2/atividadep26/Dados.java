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
            // após inserir, incrementa a posicao para quando for adicionar um novo obj
            posicao++;
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
            // após inserir, incrementa a posicao para quando for adicionar um novo obj
            posicao++;
        }
    }

    //metodo para saber a quantidade de elementos do array
    public int size(){
        // retorna o valor da posicao atual do array mais 1, dado que inicia em zero
        return posicao+1;
    }

    // metodo para remover dados do array
    // recebe um tipo object para aceitar qualquer tipo de objeto
    public void remove(Object obj){
        // percorre todos os dados do array 
        for (int i = 0; i < this.dados.length; i++) {
            // verifica se o objeto no array dados é o mesmo obj recebido no metodo
            if (this.dados[i].equals(obj)) {
                // caso seja o mesmo objeto, ele reorganiza o vetor
                // iniciando a varredura na posicao do objeto a ser removido    
                for( int j = i; i<this.dados.length; j++){
                    // atribui os dados da posicao posterior para a posicao anterior
                    // ex dados[4] = dados[5]
                    this.dados[j] = this.dados[j+1];
                }
                // decrementa a posicao visto que foi removido um item
                posicao --;
                // limpa os dados da ultima posicao inserida
                this.dados[posicao]=null;
            }
        }
    }

    // metodo para verifica se contem um dado no array
    // recebe um tipo object para aceitar qualquer tipo de objeto
    public boolean contains(Object obj){
        // percorre todos os dados do array 
        for (int i = 0; i < this.dados.length; i++) {
            // verifica se o objeto no array dados é o mesmo obj recebido no metodo
            if (this.dados[i].equals(obj)) {
                // caso encontre, retorna true
                return true;
            }
        }
        // se nao achar, retorna false
        return false;
    }
}
