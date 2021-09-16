package com.exadel.homework1;

import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
        String word1 = "Задание";
        String sentence1 = "Задание по теме «String»";
        System.out.println("isPresent: " + isPresent(  word1 , sentence1));
        String word2 = "задание";
        System.out.println("isStart: " + isStart(   word2, sentence1));
        String sentence2 = "ЗАДАНИЕ ПО ТЕМЕ «String»";
        System.out.println("isLinksEquals: " + isLinksEquals(sentence1, sentence2));
        System.out.println("isObjectsEquals: " + isObjectsEquals(sentence1,sentence2));
        System.out.println("isObjectsIgnoreCaseEquals: " + isObjectsIgnoreCaseEquals(sentence1,sentence2));
        System.out.println("isVariableEmpty: " + isVariableEmpty(sentence1));
        System.out.println("getVariableLength: " + getVariableLength(sentence1));
        char oldCharacter = '«';
        char newCharset = '!';
        System.out.println("replaceCharacter: " + replaceCharacter(oldCharacter, newCharset, sentence1));
        CharSequence oldSubString = "а";
        CharSequence newSubstring = "ААА";
        System.out.println("replaceSubString: " + replaceSubString(oldSubString, newSubstring, sentence1));
        System.out.println("splitStringInHalf: " +   splitStringInHalf(sentence1));
        System.out.println("replaceLettersWithSmall: " +   replaceLettersWithSmall(sentence1));
        System.out.println("replaceLettersWithBig: " +    replaceLettersWithBig(sentence1));
        String stringWithSpaces =  addSpacesAtBeginningAndAtEndOfSentence( sentence1);
        System.out.println("addSpacesAtBeginningAndAtEndOfSentence: " +  stringWithSpaces);
        System.out.println("deleteSpaces: " +     deleteSpaces( stringWithSpaces));
        int numberToConvert = 15;
        System.out.println("convertNumberIntoString: " +    convertNumberIntoString( numberToConvert));
    }

    public static boolean isPresent(String word, String sentence)
    {
        return sentence.toLowerCase().contains(word.toLowerCase());
    }

    public static boolean isStart(String word, String sentence)
    {
        String [] wordsArray = sentence.split(" ");
        String firstWord = wordsArray[0];
        return firstWord.equalsIgnoreCase(word);
    }

    public static boolean isLinksEquals(String sentence1, String sentence2)
    {
        return sentence1 == sentence2;
    }

    public static boolean isObjectsEquals(String sentence1, String sentence2)
    {
        return sentence1.equals(sentence2);
    }

    public static boolean isObjectsIgnoreCaseEquals(String sentence1, String sentence2)
    {
        return sentence1.equalsIgnoreCase(sentence2);
    }

    public static boolean isVariableEmpty(String sentence1)
    {
        return "".equals(sentence1);
    }

    public static int getVariableLength(String sentence1)
    {
        return sentence1.length();
    }

    public static String replaceCharacter(char oldCharacter, char newCharacter, String oldString)
    {
        return oldString.replace(oldCharacter, newCharacter);
    }

    public static String replaceSubString(CharSequence oldSubString, CharSequence newSubString, String oldString)
    {
        return oldString.replace(oldSubString, newSubString);
    }

    public static String splitStringInHalf(String oldString)
    {
        final int mid = oldString.length() / 2;
        String[] parts = {oldString.substring(0, mid), oldString.substring(mid)};
        return "Первая часть строки \"" + parts[0] + "\" вторая часть строки \"" + parts[1] + "\"";
    }

    public static String replaceLettersWithSmall(String oldString)
    {
        return oldString.toLowerCase(Locale.ROOT);
    }

    public static String replaceLettersWithBig(String oldString)
    {
        return oldString.toUpperCase(Locale.ROOT);
    }

    public static String addSpacesAtBeginningAndAtEndOfSentence(String oldString)
    {
        return String.join("", "   ", oldString, "   ");
    }

    public static String deleteSpaces(String oldString)
    {
        return oldString.trim();
    }

    public static String convertNumberIntoString(int number)
    {
        return Integer.toString(number);
    }
}
