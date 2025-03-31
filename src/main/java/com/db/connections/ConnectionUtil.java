package com.db.connections;

import com.configurations.Configs;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    @Autowired
    private Configs configs;

    private static ConnectionUtil instance;

    public static ConnectionUtil getInstance() {
        if(instance==null) instance = new ConnectionUtil();
        return instance;
    }

    private ConnectionUtil() {

    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(configs.getDriver());

        // Connect to the database

        return DriverManager.getConnection(configs.getPostgresUrl(), configs.getUsername(), configs.getPassword());
    }
}
