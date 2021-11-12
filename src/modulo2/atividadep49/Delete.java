import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class Delete {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection())
        {
            int id1 = 18;
            
            String sql = "DELETE FROM CATEGORIA WHERE ID=?";
            
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id1);
            statement.execute();;

            int qntAlterada = statement.getUpdateCount();

            System.out.printf("%d categorias excluídas!\n",qntAlterada);
        } catch (SQLException e) {
            
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
