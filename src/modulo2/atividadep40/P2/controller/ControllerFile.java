package P2.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import P2.model.PontoTuristico;

public class ControllerFile implements Controller<PontoTuristico>{
    private String filename;

    public ControllerFile(){
        this.filename = "dados/arquivo.txt";
    }

    @Override
    public String gravar(PontoTuristico model) {
        try {
            FileWriter fw = new FileWriter(new File(this.filename),true);
            //dao, objeto em string
            String ptString = model.toString();
            fw.write(ptString);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "DADOS SALVOS: "+ model.toString();
    }

    @Override
    public ArrayList<PontoTuristico> ler() {
        ArrayList<PontoTuristico> dados = new ArrayList<PontoTuristico>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                // dao, string em objeto
                String[] dado = linha.split(";");
                PontoTuristico pt = new PontoTuristico();
                pt.nome = dado[0];
                pt.descricao = dado[1];
                pt.localizacao = dado[2];

                dados.add(pt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dados;
    }
    
}
