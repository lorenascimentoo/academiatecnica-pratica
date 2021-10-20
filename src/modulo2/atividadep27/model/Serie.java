package model;
// a classe herda o comportamento da classe base
public class Serie extends Base{
    int quant_temporadas;
    int quant_episodios;
    boolean finalizada;
    String autor;
   
    public Serie(){
        super();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Serie) {
          Serie compara = (Serie) obj;
           if(this.id == compara.id){
               return true;
           }
       }
       return false;
    }
}
