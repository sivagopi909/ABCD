package org.config;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionBean implements Serializable {
    private static final String url = "jdbc:postgresql://localhost/test";
    private static final String user = "username";
    private static final String password = "password";
    private Connection conn;

    public DatabaseConnectionBean() {
        try {
            this.conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conn;
    }
}