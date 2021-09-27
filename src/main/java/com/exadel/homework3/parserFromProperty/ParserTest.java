package com.exadel.homework3.parserFromProperty;

public class ParserTest {

    public static void main(String[] args) {

        Environment testEnvironment = Environment.getEnvInstance("environment.properties");
        testEnvironment.getBuildEnv();
        testEnvironment.getTestEnv();
        testEnvironment.getBrowser();

        Environment testEnvironment2 = Environment.getEnvInstance("environment.properties");
        testEnvironment.getBuildEnv();

    }
}