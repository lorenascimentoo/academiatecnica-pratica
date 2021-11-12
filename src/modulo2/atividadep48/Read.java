import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static void main(String[] args) {
        ConexaoBD conecta = new ConexaoBD();

        try {
            Connection conn = conecta.start("postgres", "aula2021");

            String sql = "SELECT ID, NOME FROM CATEGORIA;";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();

            ResultSet retorno = statement.getResultSet();

            while(retorno.next()){
                int id = retorno.getInt("ID");
                String nome = retorno.getString("NOME");

                System.out.printf("== ID: %d\n== NOME: %s\n", id, nome);
            }
        } catch (SQLException e) {
            
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
