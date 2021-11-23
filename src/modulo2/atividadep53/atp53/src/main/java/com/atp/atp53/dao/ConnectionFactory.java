package com.atp.atp53.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;

    public ConnectionFactory(){
        // pool
        ComboPooledDataSource pool = new ComboPooledDataSource();
        this.dataSource = pool;
    }

    //gera a exceção no método para que seja tratada quando a conexao for iniciada
    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}