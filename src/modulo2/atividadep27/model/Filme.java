package model;
// a classe herda o comportamento da classe base
public class Filme extends Base{
    public String nacionalidade;
    public String distribuidor;
     
    public Filme(){
        super();
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Filme) {
          Filme compara = (Filme) obj;
           if(this.id == compara.id){
               return true;
           }
       }
       return false;
    }
}