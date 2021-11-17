package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;

public class CategoriaDAO {
    private Connection conn;

    public CategoriaDAO(Connection connection) {
        this.conn = connection;
    }

    public ArrayList<Integer> create(Categoria model) {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        String sql = "insert into categoria(nome,descricao)values(?,?);";
        try {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, model.getNome());
            statement.setString(2, model.getDescricao());
            statement.execute();

            ResultSet ids = statement.getGeneratedKeys();

            while (ids.next()) {
                int id = ids.getInt("id");
                lista.add(id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<Categoria> read() {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        String sql = "SELECT * FROM CATEGORIA;";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            ResultSet retorno = statement.getResultSet();

            while (retorno.next()) {
                Categoria cat = new Categoria(retorno.getInt("id"), retorno.getString("nome"), retorno.getString("descricao"));
                lista.add(cat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int update(Categoria model) {
        String sql = "UPDATE CATEGORIA SET NOME=? WHERE ID=?";
        int qntAlterada =0;
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, model.getNome());
            statement.setInt(2, model.getId());
            statement.execute();
            qntAlterada = statement.getUpdateCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qntAlterada;
    }

    public int delete(int id) {
        String sql = "DELETE FROM CATEGORIA WHERE ID=?";
        int qntAlterada=0;
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, id);
            statement.execute();
            qntAlterada = statement.getUpdateCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qntAlterada;
    }
}
