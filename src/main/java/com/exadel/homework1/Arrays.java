package com.exadel.homework1;

public class Arrays {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        int[][] newArray = fillArrayRandomly(array, -1, 5);

//        System.out.println("fillArrayRandomly: " +  fillArrayRandomly(array, -1, 5) );
    }

    public static int[][] fillArrayRandomly(int[][] Array, int  rangeFrom, int rangeTo)
    {
        for (int i = 0; i < Array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = ((int) (Math.random() * (rangeTo + 1 - rangeFrom)) + rangeFrom);
                if (!(j == Array[i].length-1)){
                    System.out.print(Array[i][j] + ", ");
                }else {
                    System.out.print(Array[i][j]);
                }
            }
            System.out.println("]");
        }
        return Array;
    }

//    public static void getMinAndMaxInArray(int[][] emptyArray)
//    {
//        for (int i = 0; i < emptyArray.length; i++) {
//            for (int j = 0; j < emptyArray[i].length; j++) {
//                emptyArray[i][j] = ((int) (Math.random() * (rangeTo + 1 - rangeFrom)) + rangeFrom);
//                if (!(j == emptyArray[i].length-1)){
//                    System.out.print(emptyArray[i][j] + ", ");
//                }else {
//                    System.out.print(emptyArray[i][j]);
//                }
//            }
//            System.out.println("]");
//        }
//    }




}
  //  Найти минимальное и максимальное число.




