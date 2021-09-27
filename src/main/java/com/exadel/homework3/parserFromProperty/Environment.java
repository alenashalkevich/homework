package com.exadel.homework3.parserFromProperty;

import lombok.Data;

import java.util.HashMap;

@Data
public class Environment {

    private static Environment envInstance;

    private Environment(String propFileName) {
        initEnvFields(propFileName);
    }

    public static Environment getEnvInstance(String propFileName) {
        if (envInstance == null) {
            envInstance = new Environment(propFileName);
        }
        return envInstance;
    }

    String buildEnv;
    String browser;
    String testEnv;
    HashMap<String, String> dataMap;

    public void initEnvFields(String propFileName) {
        EnvironmentPropertyLoader environmentPropertyLoader = new EnvironmentPropertyLoader();
        this.dataMap = (HashMap<String, String>) environmentPropertyLoader.loadEnvironmentData(propFileName);
        this.buildEnv = dataMap.get("buildEnv");
        this.browser = dataMap.get("browser");
        this.testEnv = dataMap.get("testEnv");
        try {

            if (buildEnv == null || browser == null || testEnv == null) {
                throw new KeyNotFoundException(String.format("Переменная(-ые): %s %s %s не найдена(-ы)", getFieldValue(buildEnv, "buildEnv"), getFieldValue(browser, "browser"), getFieldValue(testEnv, "testEnv")));
            }
        } catch (KeyNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getFieldValue(String field, String outputValue) {
        return field == null ? outputValue : "";
    }

    public String getBuildEnv() {
        System.out.println("Variable testEnv: " + buildEnv);
        return buildEnv;
    }

    public String getBrowser() {
        System.out.println("Variable browser: " + browser);
        return browser;
    }

    public String getTestEnv() {
        System.out.println("Variable testEnv: " + testEnv);
        return testEnv;
    }
}
