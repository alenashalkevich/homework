package com.exadel.homework3;

import lombok.Data;
import lombok.NonNull;

public class InnerTestClass {

    public static void main(String[] args) {

        InnerClass innerClass = new InnerClass(2544, 5433);
        System.out.println("Начальное значение Integer a: " + innerClass.innerIntegerValue);
        System.out.println("Начальное значение переменной int b: " + innerClass.innerIntValue);
        changeValueFromInnerClass(innerClass);
        System.out.println("Значение переменной a после метода: " + innerClass.innerIntegerValue);
        System.out.println("Значение переменной b после метода: " + innerClass.innerIntValue);
    }

    public static void changeValueFromInnerClass(InnerClass innerClass) {
        Integer changeValue1 = innerClass.innerIntegerValue = 0;
        int changeValue2 = innerClass.innerIntValue = 0;
        System.out.println("Результат выполнения метода changeValue над переменной innerIntegerValue: " + changeValue1);
        System.out.println("Результат выполнения метода changeValue над переменной innerIntValue: " + changeValue2);

    }

    @Data
    public static class InnerClass {
        @NonNull
        Integer innerIntegerValue;
        @NonNull
        int innerIntValue;
    }
}
