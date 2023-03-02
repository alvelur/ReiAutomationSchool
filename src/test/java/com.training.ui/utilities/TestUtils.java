package com.training.ui.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestUtils {

    public static String setUpBrowser() throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/java/config/config.properties"));
        return properties.getProperty("browser");
    }

    public static String setUpBaseUrl() throws IOException{
        Properties properties = new Properties();
        properties.load(new FileReader("src/test/java/config/config.properties"));
        return properties.getProperty("url");
    }


}
