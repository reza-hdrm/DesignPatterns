package com.rezahdrm.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private String dbDriver;
    private String dbUser;
    private String dbPassword;
    private String dbUrl;

    private Connection connection = null;

    // Lazy Loading
    private static volatile DBConnection databaseConnection = null;

    private Config config = null;

    private DBConnection() {
        config = Config.getConfig();
        openConnection();
    }

    private void setDBProperties() {
        this.dbDriver = config.getDBDriver();
        this.dbUrl = config.getDBUrl();
        this.dbUser = config.getDBUser();
        this.dbPassword = config.getDBPassword();
    }

    public Connection openConnection() {
        setDBProperties();
        try {
            connection = DriverManager.getConnection(this.dbUrl, this.dbUser, this.dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static DBConnection getDBConnection() {
        // Double Check and Thread Safe
        if (databaseConnection == null)
            synchronized (DBConnection.class) {
                if (databaseConnection == null)
                    databaseConnection = new DBConnection();
            }
        return databaseConnection;
    }

    public Connection getConnection() {
        return connection;
    }

}
