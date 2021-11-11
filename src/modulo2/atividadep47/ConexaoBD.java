import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private String driverType;
    private String driverName;
    private String host;
    private int port;
    private String database;
    private String user;
    private String pwd;

    public ConexaoBD(){
        this.driverType="jdbc";
        this.driverName="postgresql";
        this.host="localhost";
        this.port=5432;
        this.database="postgres";
    }

    //quando iniciar a conexao passa as credencias de acesso
    //gera a exceção no método para que seja tratada quando a conexao for iniciada
    public Connection start(String user, String pwd) throws SQLException{
        this.user = user;
        this.pwd = pwd;
        String connecString = String.format("%s:%s://%s:%d/%s", this.driverType,this.driverName,this.host,this.port,this.database);
        
        Connection conn = DriverManager.getConnection(connecString, this.user, this.pwd);
        return conn;
    }
    
}