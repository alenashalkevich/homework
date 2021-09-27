package com.exadel.homework2;

import com.exadel.homework1.Array;

import java.util.*;
import java.util.stream.Collectors;

public class Transformer {

    public static void main(String[] args) {
        int[][] array = new int[5][10];
        int[][] newArray = Array.fillArrayRandomly(array, -1, 5);
        List<List<Integer>> listOfLists = transformArrayToListOfLists(newArray);
        System.out.println("Лист листов, полученный из массива: " + listOfLists);
        List<Integer> list = transformListOfListsToList(listOfLists);
        System.out.println("Лист, полученный из листа листов: " + list);
        System.out.println("Количество цифер \"0\": " + getCountOfNumber(list, 0));
        System.out.println("Минимальное значение из первых 5 чисел листа: " + getMinFromCountFirstDefinedNumbers(list, 5));
        System.out.println("Преобразовали в строки: " + transformNumbersInString(list));
        System.out.println("Set: " + toSet(list));
        int[] array1 = {1, 5, 8, 10, 7};
        System.out.println("Преобразовали массив в List: " + transformArrayToList(array1));
    }

    public static List<List<Integer>> transformArrayToListOfLists(int[][] array)
    {
        return  Arrays.stream(array).map(arr -> Arrays.stream(arr).boxed().toList()).collect(Collectors.toList());
    }

    public static List<Integer> transformListOfListsToList(List<List<Integer>> listOfLists)
    {
        return  listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public static long getCountOfNumber(List<Integer> list, int requiredNumber)
    {
       return list.stream().filter(element -> element == requiredNumber).count();
    }

    public static int getMinFromCountFirstDefinedNumbers(List<Integer> list, int countFirstDefinedNumbers)
    {
        return list.stream().limit(countFirstDefinedNumbers).min(Integer::compareTo).get();
    }

    public static List<String> transformNumbersInString(List<Integer> list)
    {
        return list.stream().map(String::valueOf).collect(Collectors.toList());
    }

    public static Set<Integer> toSet(List<Integer> list)
    {
        return list.stream().collect(Collectors.toSet());
    }

    public static List<Integer> transformArrayToList(int[] array)
    {
        return Arrays.stream(array).boxed().collect(Collectors.toList());
    }
}
