package com.project.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static{

        String path = "configuration.properties";

        try {
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
        public static String get(String keyName){

        return properties.getProperty(keyName);


        }




}
