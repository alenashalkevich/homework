package com.exadel.homework1;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[][] array = new int[5][10];
        int[][] newArray = fillArrayRandomly(array, -1, 5);
        System.out.println("getMinInArray: " +   getMinInArray(newArray) );
        System.out.println("getMaxInArray: " +   getMaxInArray(newArray) );
        System.out.println("getIndexesOfMin: " +   getIndexesOfMin(newArray) );
        System.out.println("getCountOfMax: " +   getCountOfMax(newArray) );

    }

    public static int[][] fillArrayRandomly(int[][] array, int  rangeFrom, int rangeTo)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * (rangeTo + 1 - rangeFrom)) + rangeFrom);
                if (!(j == array[i].length-1)){
                    System.out.print(array[i][j] + ", ");
                }else {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println("]");
        }
        return array;
    }

    public static int getMinInArray(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static ArrayList<String> getIndexesOfMin(int[][] array) {
        int min = getMinInArray(array);
        ArrayList<String> indexesOfMin = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) {
                    indexesOfMin.add("[" + i + ", " + j + "]");
                }
            }
        }
        return indexesOfMin;
    }

    public static int getMaxInArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int getCountOfMax(int[][] array) {
        int countOfMax = 0;
        int max = getMaxInArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max == array[i][j]) {
                    countOfMax++;
                }
            }
        }
        return countOfMax;
    }
}




