import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) {
        ConexaoBD conecta = new ConexaoBD();

        try {
            Connection conn = conecta.start("postgres", "aula2021");

            Statement statement = conn.createStatement();
            String sql = "insert into categoria(nome,descricao)values('audiovisual','bla');";
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);

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