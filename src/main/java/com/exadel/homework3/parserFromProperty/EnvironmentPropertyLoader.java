package com.exadel.homework3.parserFromProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EnvironmentPropertyLoader {

    Map<String, String> dataMap;

    public Map<String, String> loadEnvironmentData(String propFileName) {

        if (this.dataMap == null) {
            dataMap = new HashMap<>();
            try (InputStream inputStream = EnvironmentPropertyLoader.class.getClassLoader().getResourceAsStream(propFileName)) {
                Properties prop = new Properties();

                if (inputStream != null) {
                    prop.load(inputStream);

                } else {
                    throw new FileNotFoundException("The specified properties file '" + propFileName + "' was not found in the classpath");
                }

                prop.forEach((key, value) -> dataMap.put(key.toString(), value.toString()));

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return dataMap;
    }
}
