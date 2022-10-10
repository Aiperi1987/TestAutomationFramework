package com.talentlms.UI.dataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {

        try {

            String path = "src/test/resources/configurations.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
    public static String gerProperty(String key){
        return properties.getProperty(key).trim();

    }
}
