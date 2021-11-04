package P1.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    // metodo de leitura no arquivo
    public ArrayList<Empresa> ler(){
        ArrayList<Empresa> dados = new ArrayList<Empresa>();
        try {
            Scanner sc = new Scanner(new File(this.filename));
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                // transformando a string em objeto
                String[] dado = linha.split(";");
                Empresa e = new Empresa();
                e.nome = dado[0];
                e.cnpj = dado[1];
                e.ramo_atividade = dado[2];

                dados.add(e);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dados;
    }
}
