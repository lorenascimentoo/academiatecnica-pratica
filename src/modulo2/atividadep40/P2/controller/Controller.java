package P2.controller;

import java.util.ArrayList;

public interface Controller<T> {
    
    public String gravar(T model);
    
    public ArrayList<T> ler();
}
