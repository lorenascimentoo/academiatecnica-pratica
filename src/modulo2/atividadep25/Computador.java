
public class Computador {
    public String marca;
    public String memoria_ram;
    public String processador;
    public String disco_rigido;
    
    //sobrescrita do metodo toString da classe
    @Override
    public String toString() {
        // retorno direto dos atributos da classe
        return "== MARCA: "+this.marca+"\n== MEMORIA RAM: "+this.memoria_ram+"\n== PROCESSADOR: "+this.processador+"\n== DISCO RIGIDO: "+this.disco_rigido;
    }
}