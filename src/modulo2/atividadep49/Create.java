import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;

public class Create {
    public static void main(String[] args) {
     

        try (Connection conn = new ConnectionFactory().getConnection())
        { 

            String nome = "fitness";
            String descricao = "academia";
            String sql = "insert into categoria(nome,descricao)values(?,?);";
            
            PreparedStatement statement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            statement.setString(1,nome);
            statement.setString(2,descricao);
            statement.execute();

            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.printf("O ID %d foi gerado com sucesso", id);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}