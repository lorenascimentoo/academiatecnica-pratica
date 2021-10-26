package controller;

import java.util.ArrayList;

import model.Categoria;
import model.Produto;

public class CategoriaController extends BaseController<Categoria>{
    
    public void adicionarProduto(Categoria c, Produto p){
        c.produtos.add(p);
        atualizar(c);
    }

    public void removerProduto(Categoria c, Produto p){
        c.produtos.remove(p);
        atualizar(c);
    }

    public void atualizarProduto(Categoria c, Produto p){
        if (c.produtos.contains(p)) {
            removerProduto(c, p);
            adicionarProduto(c, p);
        }
    }

    public ArrayList<Produto> listarProdutos(Categoria c){
        return c.produtos;
    }
}
