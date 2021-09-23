package com.exadel.homework3.parserFromProperty;

import java.util.HashMap;

public class ParserTest {

    public static void main(String[] args) {

//        HashMap<String, String> dataMap = (HashMap<String, String>) EnvironmentProperty.environmentData("environment.properties");
//
//        try {
//            String buildEnv = dataMap.get("buildEnv");
//            String browser = dataMap.get("browser");
//            String testEnv = dataMap.get("testEnv");
//
//            if (buildEnv != null && browser != null && testEnv != null) {
//
//                System.out.println("Переменная testEnv: " + buildEnv);
//                System.out.println("Переменная browser: " + browser);
//                System.out.println("Переменная testEnv: " + testEnv);
//
//            } else {
//
//                throw new KeyNotFoundException("Переменная(-ые): " + (buildEnv == null ? "buildEnv" : "") + (browser == null ? "browser" : "") + (testEnv == null ? "testEnv" : "") + " не найдена(-ы)");
//
//            }
//        } catch (KeyNotFoundException e) {
//            System.out.println(e.getMessage());
//        }

        HashMap<String, String> dataMap = (HashMap<String, String>) ReadFile.environmentData("src/main/resources/environment.properties");
        try {
            String buildEnv = dataMap.get("buildEnv");
            String browser = dataMap.get("browser");
            String testEnv = dataMap.get("testEnv");

            if (buildEnv != null && browser != null && testEnv != null) {

                System.out.println("Переменная testEnv: " + buildEnv);
                System.out.println("Переменная browser: " + browser);
                System.out.println("Переменная testEnv: " + testEnv);

            } else {

                throw new KeyNotFoundException("Переменная(-ые): " + (buildEnv == null ? "buildEnv " : "") + (browser == null ? "browser " : "") + (testEnv == null ? "testEnv" : "") + " не найдена(-ы)");

            }
        } catch (KeyNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}