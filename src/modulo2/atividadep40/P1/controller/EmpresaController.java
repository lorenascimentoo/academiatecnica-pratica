package P1.controller;

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
}
