package com.zerobank.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author esalkan
 * @project ZeroBankBDDFramework
 * @github https://github.com/esalkan/ZeroBankBDDFramework
 */
public class ConfReader {
    // Java util Properties Package
    private static Properties properties;

    static {
        try {
            // Which file need to be read
            String path = "conf.properties";
            // Read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file
            // input is loaded / fed in to the properties object
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Creating static method, and then we not need to create an object for the call the method just directly reach from class....
    public static String getConf(String keyName){
        return properties.getProperty(keyName);
    }
}
