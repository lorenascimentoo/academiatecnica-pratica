import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        // Inicializa a classe que contem as informacoes de conexao com o banco
        ConexaoBD conecta = new ConexaoBD("postgres", "aula2021");

        try {
            // inicia a conexão com o banco 
            Connection con = conecta.start();

            // inicializa o metodo que utiliza as instrucoes sql
            Statement statement = con.createStatement();
            String sql = "delete from produto where id=9;";
            statement.execute(sql);

            // pega o retorno da consulta
            int qtdAlteracoes= statement.getUpdateCount();

            System.out.printf("%d produtos foram deletados!", qtdAlteracoes);
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar com o banco de dados");
        }
    }
}
