package com.academy.telesen;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String input = lineEnter();
        printInitialString(input);
        startWithFinder(input);

    }

    public static String lineEnter() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;
    }

    public static void printInitialString(String string) {
        System.out.println(string);
    }

    public static void startWithFinder(String string) {
        int i = 0;
        for (String newString : string.split(" ")) {
            if (newString.endsWith("ED")) {
                i++;
                System.out.println(newString);
            }
        }
        System.out.println(i);

    }
}
