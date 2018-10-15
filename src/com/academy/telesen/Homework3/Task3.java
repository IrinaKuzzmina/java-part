package com.academy.telesen.Homework3;

import java.util.Scanner;

public class Task3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String stringInput = lineEnter();
        printInitialString(stringInput);
        String subStringInput = subStringEnter();
        printInitialString(subStringInput);
        substringCounter(stringInput, subStringInput);
    }

    public static String lineEnter() {
        System.out.println("Please, enter a string");
        String string = scan.nextLine();
        return string;
    }

    public static void printInitialString(String string) {
        System.out.println(string);
    }

    public static String subStringEnter() {
        System.out.println("Please, enter a substring");
        String subString = scan.nextLine();
        return subString;
    }

    public static void substringCounter(String string, String subString) {
        int i = 0;
        while (string.contains(subString)) {
            string = string.replaceFirst(subString, "");
            i++;
        }
        System.out.println(i);
    }
}
