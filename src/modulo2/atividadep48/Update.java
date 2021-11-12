import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        ConexaoBD conecta = new ConexaoBD();

        try {
            Connection conn = conecta.start("postgres", "aula2021");

            Statement statement = conn.createStatement();
            
            String sql = "UPDATE CATEGORIA SET NOME='INFORMATICA' WHERE ID=1 OR ID=3";
            statement.execute(sql);
            int qntAlterada = statement.getUpdateCount();

            System.out.printf("%d categorias atualizadas!\n",qntAlterada);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
