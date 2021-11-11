import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) {
        // Inicializa a classe que contem as informacoes de conexao com o banco
        ConexaoBD conecta = new ConexaoBD("postgres", "aula2021");

        try {
            // inicia a conexão com o banco 
            Connection con = conecta.start();

            // inicializa o metodo que utiliza as instrucoes sql
            Statement statement = con.createStatement();
            String sql = "insert into produto(nome,descricao,preco,categoria_id)values('kindle','para leitura',399.90,1);";
            statement.execute(sql,Statement.RETURN_GENERATED_KEYS);

            // pega o retorno da consulta
            ResultSet ids= statement.getGeneratedKeys();

            //enquanto houver dados em retorno
            while (ids.next()) {
                // faz a dao para pegar as informacoes de produto
                int id = ids.getInt(1);
                System.out.printf("ID %d gerado com sucesso!", id);
            }
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar com o banco de dados");
        }
    }
}
