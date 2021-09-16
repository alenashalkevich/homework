package com.exadel.homework1;

public class AutoPackaging {
    public static void main(String[] args) {
        Integer i = 5;
        getPrimitiveInt(i);
        double d = 66.87;
        getDouble(d);
        Integer a = 2544;
        int b = 4534;
        System.out.println("Начальное значение Integer a: " + a);
        System.out.println("Начальное значение переменной int b: " + b);
        changeValue(a);
        changeValue(b);
        System.out.println("Значение переменной a осталось: " + a);
        System.out.println("Значение переменной b осталось: " + b);
    }

    public static void getPrimitiveInt(int number)
    {
        System.out.println("Значение после метода getPrimitiveInt: " + number);
    }

    public static void getDouble(Double number)
    {
        System.out.println("Значение после метода getDouble: " + number);
    }

    public static void changeValue(Integer number)
    {
        number = 4;
        System.out.println("Результат выполнения метода changeValue над переменной: " + number);
    }

}
