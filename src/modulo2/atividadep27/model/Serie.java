package model;
// a classe herda o comportamento da classe base
public class Serie extends Base{
    public int quant_temporadas;
    public int quant_episodios;
    public boolean finalizada;
    public String autor;
   
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
