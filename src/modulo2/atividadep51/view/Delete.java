package view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.CategoriaDAO;
import utils.ConnectionFactory;

public class Delete {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection())
        {
            CategoriaDAO dao = new CategoriaDAO(conn);

            dao.delete(19);          
            
        } catch (SQLException e) {
            
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
