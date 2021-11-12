package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String driverType;
    private String driverName;
    private String host;
    private int port;
    private String database;
    private String user;
    private String pwd;

    public ConnectionFactory(){
        this.driverType="jdbc";
        this.driverName="postgresql";
        this.host="localhost";
        this.port=5432;
        this.database="postgres";
        this.user = "postgres";
        this.pwd = "aula2021";
    }

    //gera a exceção no método para que seja tratada quando a conexao for iniciada
    public Connection getConnection() throws SQLException{
        String connecString = String.format("%s:%s://%s:%d/%s", this.driverType,this.driverName,this.host,this.port,this.database);       
        Connection conn = DriverManager.getConnection(connecString, this.user, this.pwd);
        return conn;
    }
    
}