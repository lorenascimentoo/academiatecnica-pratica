package view;

import P1.controller.EmpresaController;
import P1.model.Empresa;

public class Main {
    public static void main(String[] args) {
        EmpresaController ec = new EmpresaController();

        Empresa e1 = new Empresa();
        e1.nome="PEARSON SPECTER";
        e1.cnpj="11111111111";
        e1.ramo_atividade="JURÍDICO";

        // metodo da controller
        ec.salvar(e1);

        Empresa e2 = new Empresa();
        e2.nome="SULLIVAN'S";
        e2.cnpj="22222222222";
        e2.ramo_atividade="RESTAURANTE";
        ec.salvar(e2);
    }
}
