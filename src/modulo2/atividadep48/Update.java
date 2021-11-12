import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        ConexaoBD conecta = new ConexaoBD();

        try {
            Connection conn = conecta.start("postgres", "aula2021");
            
            String nome = "altera categoria";
            int id = 19;
            String sql = "UPDATE CATEGORIA SET NOME=? WHERE ID=?";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,nome);
            statement.setInt(2, id);
            statement.execute();
            int qntAlterada = statement.getUpdateCount();

            System.out.printf("%d categorias atualizadas!\n",qntAlterada);
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
