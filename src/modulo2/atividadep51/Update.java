import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Update {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection())
        {            
            String nome = "altera categoria";
            int id = 26;
            String sql = "UPDATE CATEGORIA SET NOME=? WHERE ID=?";
            try {
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1,nome);
                statement.setInt(2, id);
                statement.execute();
                int qntAlterada = statement.getUpdateCount();
    
                System.out.printf("%d categorias atualizadas!\n",qntAlterada);    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
