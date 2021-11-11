import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private String driveType;
    private String driveName;
    private String host;
    private int port;
    private String database;
    private String user;
    private String pwd;

    // inicializa passando o usuario e a senha
    public ConexaoBD(String user, String pwd){
        this.driveType="jdbc";
        this.driveName="postgresql";
        this.host="localhost";
        this.port =5432;
        this.database="postgres";
        this.user=user;
        this.pwd=pwd;
    }

    //gera a exceção no método para que seja tratada quando a conexao for iniciada
    public Connection start() throws SQLException{
        String connectionString = String.format("%s:%s://%s:%d/%s", this.driveType,this.driveName,this.host,this.port,this.database);
        Connection conn = DriverManager.getConnection(connectionString,user,pwd);
        return conn;
    }
}
