package com.rezahdrm.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private Properties properties = null;
    // Lazy Loading
    private static volatile Config config = null;

    private Config() {
        String pathname = "src/main/resources/application.properties";
        try (FileInputStream fileInputStream = new FileInputStream(new File(pathname))) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDBDriver() {
        return properties.getProperty("com.settings.db_driver");
    }

    public String getDBUrl() {
        return properties.getProperty("com.settings.db_url");
    }

    public String getDBUser() {
        return properties.getProperty("com.settings.db_user");
    }

    public String getDBPassword() {
        return properties.getProperty("com.settings.db_password");
    }


    public static Config getConfig() {
        // Double Check and Thread Safe
        if (config == null)
            synchronized (Config.class) {
                if (config == null)
                    config = new Config();
            }
        return config;
    }

}
