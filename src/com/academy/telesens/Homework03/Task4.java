package com.academy.telesens.Homework03;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        String input = lineEnter();
        printInitialString(input);
        String charsOnly = removeNumbers(input);
        String numberOnly = findRemovedNumbers(input);
        printModifiedString(charsOnly);
        printRemovedNumbers (numberOnly);
    }

    public static String lineEnter() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;
    }

    public static void printInitialString(String string) {
        System.out.println(string);
    }

    public static String removeNumbers(String string) {
        String charsOnly = string.replaceAll("[0-9]", "");
        return charsOnly;
    }

    public static void printModifiedString(String charsOnly) {
        System.out.println(charsOnly);
    }

    public static String findRemovedNumbers(String string) {
        String numberOnly = string.replaceAll("[^0-9]", "");
        return numberOnly;
    }

    public static void printRemovedNumbers(String numberOnly) {
        System.out.println(numberOnly);
    }

}
