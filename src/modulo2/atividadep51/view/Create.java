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

            String nome = "utilizando poll";
            String descricao = "teste";
            String sql = "insert into categoria(nome,descricao)values(?,?);";
            try {
                PreparedStatement statement = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
                statement.setString(1,nome);
                statement.setString(2,descricao);
                statement.execute();
    
                ResultSet ids = statement.getGeneratedKeys();
    
                while(ids.next()){
                    int id = ids.getInt("id");
                    System.out.printf("O ID %d foi gerado com sucesso", id);
                }    
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}