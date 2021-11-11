import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class LeituraeEscrita {

    public static void main(String[] args) {
        try {
            // fluxo de entrada pelo terminal
            InputStream fis = System.in;
            // leitor de fluxo
            Reader isr = new InputStreamReader(fis);
            // buffer de leitura
            BufferedReader br = new BufferedReader(isr);

            // fluxo de escrita em um arquivo
            OutputStream fos = new FileOutputStream("dados/teclado.txt");
            // escrita no fluxo
            Writer osw = new OutputStreamWriter(fos);
            // buffer de escrita
            BufferedWriter bw = new BufferedWriter(osw);

            System.out.print("insira uma informacao: ");
            //faz a primeira leitura no teclado
            String linha = br.readLine();
            //então entra no loop
            while(linha != null && !linha.equals("q")){
                //escreve no arquivo
                bw.write(linha+"\n");
                //solicita novamente uma informacao a ser verificada no while
                System.out.print("insira uma informação ou escreva q para sair: ");
                linha = br.readLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}