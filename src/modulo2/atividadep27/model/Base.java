package model;

// Classe com informações comuns
public class Base {
    int id;
    String titulo;
    String sinopse;
    String tipo;
    String anoLancamento;
    
    // ao inicializar um objeto, já deve ser atribuido o valor do id
    public Base(int id){
        this.id = id;
    }

}

