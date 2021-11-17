package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDAO;
import model.Categoria;
import utils.ConnectionFactory;

public class Create {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()) {
            CategoriaDAO dao = new CategoriaDAO(conn);

            Categoria cat = new Categoria("teste de dao", "descricao");
            dao.create(cat);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}