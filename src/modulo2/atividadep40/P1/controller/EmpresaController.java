package P1.controller;

import java.util.ArrayList;

import P1.dao.EmpresaDAO;
import P1.model.Empresa;

public class EmpresaController {
    private EmpresaDAO dao;

    public EmpresaController(){
        this.dao = new EmpresaDAO();
    }

    public String salvar(Empresa e){
        return this.dao.salvar(e);
    }

    public ArrayList<Empresa> listar(){
        return this.dao.ler();
    }
}
