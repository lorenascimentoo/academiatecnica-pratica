package model;

import java.util.Random;

public abstract class Base {
    public int id;
    public String nome;
    // metodo construtor da classe base
    public Base(){
        this.id = geraId();
    }

    //metodo para gerar o id do objeto automaticamente
    private int geraId(){
        Random id = new Random();
        return id.nextInt(100);
    }

    // sobrescrita do metodo para comparacao do id
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Base) {
            Base comparar = (Base) obj;
            if(this.id == comparar.id){
                return true;
            }     
        }
        return false;
    }
    // sobrescrita do metodo para impressao dos dados
    @Override
    public String toString() {
        return "== ID: " + this.id+ "\n== NOME: "+this.nome;
    }
}
