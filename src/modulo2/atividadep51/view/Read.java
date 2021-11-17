package view;
import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDAO;
import model.Categoria;
import utils.ConnectionFactory;

public class Read {
    public static void main(String[] args) {
        
        try (Connection conn = new ConnectionFactory().getConnection())
        {
            CategoriaDAO dao = new CategoriaDAO(conn);

            for (Categoria cat : dao.read()) {
                System.out.printf("== ID: %s \n== NOME: %s\n **\n",cat.getId(),cat.getNome());
            }
                        
        } catch (SQLException e) {
            
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
