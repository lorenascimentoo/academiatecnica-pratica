package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDAO;
import model.Categoria;
import utils.ConnectionFactory;

public class Update {
    public static void main(String[] args) {

        try (Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(conn);
            Categoria cat = new Categoria();
            cat.setNome("altera categoria via dao");
            cat.setId(25);

            dao.update(cat);

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar ao banco de dados");
        }
    }
}
