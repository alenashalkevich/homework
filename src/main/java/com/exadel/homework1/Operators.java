package com.exadel.homework1;

public class Operators {
    public static void main(String[] args) {
        byte hours1 = 24;
        int minutes1 = 60;
        System.out.println("countMinutesPerDay: " + countMinutesPerDay( hours1,minutes1));
        long hours2 = 24;
        double minutes2 = 60;
        short seconds = 60;
        System.out.println("countSecondsPerDay: " + countSecondsPerDay(   hours2, minutes2,  seconds));
    }

    public static double countMinutesPerDay(byte hours, int minutes){
        double d = hours * minutes;
        return d;
    }

    public static double countSecondsPerDay(long hours, double minutes, short seconds){
        byte b = (byte) ( hours * minutes * seconds);
        return b;
    }

}
