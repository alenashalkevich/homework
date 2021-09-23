package com.exadel.homework3.parserToJson;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class ParsToJsonTest {

    public static void main(String[] args) {

        Car.Rudder rudder = new Car.Rudder();
        rudder.setId(576);
        rudder.setDiameter(30);
        Car peugeot = new Car("308", 1378, rudder);

        Gson gson = new Gson();
        String json = gson.toJson(peugeot);
        System.out.println(json);

        try {
            FileWriter file = new FileWriter("src/main/resources/car.json");
            file.write(json);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
