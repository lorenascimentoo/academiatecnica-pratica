public class Desktop {
    public String tamanho_gabinete;
    public String monitor_externo;
    public String fonte;

    //sobrescrita do metodo toString da classe
    @Override
    public String toString() {
        // gerando a string de informações da classe filha(desktop)
        String retorno = "\n== TAMANHO GABINETE: "+this.tamanho_gabinete+"\n== MONITOR EXTERNO: "+this.monitor_externo+"\n== FONTE: "+this.fonte;
        // pela herança é necessario imprimir os dados da classe mae(computador)
        // assim, primeiro chama o metodo toString da classe mae e depois concatena com a string gerada da classe filha
        return super.toString() + retorno;
    }
}
