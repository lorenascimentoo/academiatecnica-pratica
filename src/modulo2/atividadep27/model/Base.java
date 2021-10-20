package model;

import java.util.Random;

// Classe com informações comuns
public class Base {
    public int id;
    public String titulo;
    public String sinopse;
    public String tipo;
    public String anoLancamento;
    
    // ao inicializar um objeto, já deve ser atribuido o valor do id
    public Base(){
        this.id = geraId();
    }

    //metodo para gerar o id do objeto automaticamente
    private int geraId(){
        Random id = new Random();
        return id.nextInt(100);
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Base) {
           Base compara = (Base) obj;
           if(this.id == compara.id){
               return true;
           }
       }
       return false;
    }

    @Override
    public String toString() {
        return "id: "+this.id+"\n"+"titulo: "+this.titulo+"\n"+"sinopse: "+this.sinopse+"\n"+"tipo: "+this.tipo+"\n"+"Ano Lancamento: "+this.anoLancamento;
    }

}

