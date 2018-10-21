package com.academy.telesens.Homework03;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        String input = lineEnter();
        printInitialString(input);
        String reverseString = buildReverseString(input);
        definePolyndrom(input, reverseString);

    }

    public static String lineEnter() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;
    }

    public static void printInitialString(String string) {
        System.out.println(string);
    }

    public static String buildReverseString(String string) {
        StringBuffer buffer = new StringBuffer(string);
        String reverseString = buffer.reverse().toString();
        return reverseString;
    }

    public static void printReverseString(String reverseString) {
        System.out.println(reverseString);
    }

    public static void definePolyndrom(String string, String reverseString) {
        if (string.equals(reverseString)) {
            System.out.println("It's a polyndrom.");
        } else {
            System.out.println("It's not a polyndrom.");
        }
    }
}

