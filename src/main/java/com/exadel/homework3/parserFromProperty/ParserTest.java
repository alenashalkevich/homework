package com.exadel.homework3.parserFromProperty;

public class ParserTest {

    public static void main(String[] args) {

        Environment testEnvironment = new Environment("environment.properties");
        testEnvironment.getBuildEnv();
        testEnvironment.getTestEnv();
        testEnvironment.getBrowser();
    }
}