// a classe notebook herda os atributos da classe computador
public class Notebook extends Computador{
    public String bateria;
    public String velocidade_wifi;
    public String versao_bluetooth;

    //sobrescrita do metodo toString da classe
    @Override
    public String toString() {
        // gerando a string de informações da classe filha(notebook)
        String retorno = "\n== BATERIA: "+this.bateria+ "\n== VELOCIDADE WIFI: "+this.velocidade_wifi+"\n== VERSAO BLUETOOTH: "+this.versao_bluetooth;
        // pela herança é necessario imprimir os dados da classe mae(computador)
        // assim, primeiro chama o metodo toString da classe mae e depois concatena com a string gerada da classe filha
        return super.toString() + retorno;
    }
}
