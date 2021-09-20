package com.exadel.homework1;

import java.awt.*;

public class Cat {
    int wight;
    int high;
    String name;
    Color color;

    public Cat() {
       this(5);
    }

    public Cat(int wight, int high, String name) {
        this( wight, high);
        this.wight = wight;
        this.high = high;
        this.name = name;
    }

    public Cat(int high) {
        super();
        this.high = high;
    }

    public Cat(int wight, int high) {
        super();
        this.wight = wight;
        this.high = high;
    }
}
