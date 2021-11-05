package P2.controller;

import java.util.ArrayList;
import P2.model.PontoTuristico;

public class ControllerList implements Controller<PontoTuristico>{
    private ArrayList<PontoTuristico> dados;

    public ControllerList(){
        this.dados = new ArrayList<PontoTuristico>();
    }
    @Override
    public String gravar(PontoTuristico model) {
        this.dados.add(model);
        return "DADOS SALVOS: "+ model.toString();
    }

    @Override
    public ArrayList<PontoTuristico> ler() {
        return this.dados;
    }
}
