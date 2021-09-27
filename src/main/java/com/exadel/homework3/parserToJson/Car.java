package com.exadel.homework3.parserToJson;

public class Car {

    private String model;
    private int weight;
    private Rudder rudder;

    public Car(String model, int weight, Rudder rudder) {
        this.model = model;
        this.weight = weight;
        this.rudder = rudder;
    }


    public void start() {
        System.out.println("Поехали!");
    }

    public static class Rudder {

        private int id;
        private int diameter;

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDiameter(int diameter) {
            this.diameter = diameter;
        }
    }
}
