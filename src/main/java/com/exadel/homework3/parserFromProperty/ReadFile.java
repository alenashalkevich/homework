package com.exadel.homework3.parserFromProperty;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {

    public static Map<String, String> environmentData(String filePath) {

        Map<String, String> dataMap = new HashMap<>();
        File myFile = new File(filePath);
        try (FileReader fileReader = new FileReader(myFile)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] m = line.split("=");
                dataMap.put(m[0], m[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataMap;
    }
}
