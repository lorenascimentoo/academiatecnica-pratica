import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
    public static void main(String[] args) {
        
        try {
            // caminho de saída do arquivo
            FileOutputStream saida = new FileOutputStream("dados/arquivosaida.txt");
            // escritor do stream
            OutputStreamWriter writer = new OutputStreamWriter(saida);
            // buffer de escrita
            BufferedWriter escritor = new BufferedWriter(writer);
            char a = 'A';
            //escrevendo um char
            escritor.write(a);
            //fazendo a quebra de linha
            escritor.newLine();
            escritor.append("Teste de metodos para uso do BufferedWriter!\n");
            escritor.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        

    }
}
