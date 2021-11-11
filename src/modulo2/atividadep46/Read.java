import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        // Inicializa a classe que contem as informacoes de conexao com o banco
        ConexaoBD conecta = new ConexaoBD("postgres", "aula2021");

        try {
            // inicia a conexão com o banco 
            Connection con = conecta.start();

            // inicializa o metodo que utiliza as instrucoes sql
            Statement statement = con.createStatement();
            statement.execute("SELECT*FROM PRODUTO");

            // pega o retorno da consulta
            ResultSet retorno = statement.getResultSet();

            //enquanto houver dados em retorno
            while (retorno.next()) {
                // faz a dao para pegar as informacoes de produto
                int id = retorno.getInt("id");
                String nome = retorno.getString("nome");
                String descricao = retorno.getString("descricao");
                double preco = retorno.getDouble("preco");
                int categoria_id = retorno.getInt("categoria_id");

                System.out.printf("ID:%d \nNOME: %s \nDESCRICAO: %s \nPRECO: %.2f \nCATEGORIA ID: %d\n *** \n", id, nome,descricao,preco,categoria_id);
            }
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar com o banco de dados");
        }
    }
}