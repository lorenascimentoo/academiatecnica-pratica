import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        ConexaoBD conecta = new ConexaoBD();

        try {
            Connection conn = conecta.start("postgres", "aula2021");

            Statement statement = conn.createStatement();
            
            String sql = "DELETE FROM CATEGORIA WHERE ID>19;";
            statement.execute(sql);

            int qntAlterada = statement.getUpdateCount();

            System.out.printf("%d categorias excluídas!\n",qntAlterada);
        } catch (SQLException e) {
            
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
