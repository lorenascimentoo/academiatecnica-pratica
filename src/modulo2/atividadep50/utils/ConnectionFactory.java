package utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private String driverType;
    private String driverName;
    private String host;
    private int port;
    private String database;
    private String user;
    private String pwd;

    private DataSource dataSource;

    public ConnectionFactory(){
        //informacoes da conexao
        this.driverType="jdbc";
        this.driverName="postgresql";
        this.host="localhost";
        this.port=5432;
        this.database="postgres";
        String connecString = String.format("%s:%s://%s:%d/%s", this.driverType,this.driverName,this.host,this.port,this.database);
        this.user = "postgres";
        this.pwd = "aula2021";

        // pool
        ComboPooledDataSource pool = new ComboPooledDataSource();
        pool.setJdbcUrl(connecString);
        pool.setUser(this.user);
        pool.setPassword(this.pwd);
        pool.setMaxPoolSize(50);
        
        this.dataSource = pool;
    }

    //gera a exceção no método para que seja tratada quando a conexao for iniciada
    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
    
}