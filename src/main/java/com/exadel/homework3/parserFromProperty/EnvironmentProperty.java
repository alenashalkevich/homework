package com.exadel.homework3.parserFromProperty;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class EnvironmentProperty {

    public static Map<String, String> environmentData(String propFileName) {
        Map<String, String> dataMap = new HashMap<>();

        try {
            Properties prop = new Properties();
            InputStream inputStream = EnvironmentProperty.class.getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);

            } else {
                throw new FileNotFoundException("Указанный properties файл '" + propFileName + "' не найден в classpath");
            }

            prop.forEach((key, value) -> dataMap.put(key.toString(), value.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataMap;
    }

}
