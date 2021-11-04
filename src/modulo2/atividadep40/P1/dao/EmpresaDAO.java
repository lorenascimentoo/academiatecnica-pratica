package P1.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import P1.model.Empresa;

public class EmpresaDAO {
    private String filename;

    public EmpresaDAO(){
        this.filename = "P1/dados/arquivo.csv";
    }

    // metodo de escrita no arquivo
    public String salvar(Empresa e){
        try {
            FileWriter fw = new FileWriter(new File(this.filename),true);
            //CONVERSAO DO OBJETO EM STRING : DAO
            String empString = e.toString();
            fw.write(empString);
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return "DADOS SALVOS: "+e.toString();
    }
}
