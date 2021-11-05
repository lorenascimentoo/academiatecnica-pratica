package P2.view;

import P2.controller.Controller;
import P2.controller.ControllerList;
import P2.model.PontoTuristico;

public class ViewList {
    public static void main(String[] args) {
        Controller<PontoTuristico> c = new ControllerList();

        PontoTuristico pt1 = new PontoTuristico();
        pt1.nome = "Mangal das Garcas";
        pt1.descricao = "bla bla bla";
        pt1.localizacao = "Belém-Pará";

        c.gravar(pt1);

        PontoTuristico pt2 = new PontoTuristico();
        pt2.nome = "Ver-O-Peso";
        pt2.descricao = "bla bla bla";
        pt2.localizacao = "Belém-Pará";

        c.gravar(pt2);

        for (PontoTuristico pt : c.ler()) {
            System.out.println(pt);
        }
    }
}
