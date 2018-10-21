package com.academy.telesens.Homework03;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String input = lineEnter();
        printInitialString(input);
        buildReverseString(input);
    }

    public static String lineEnter() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;

    }

    public static void printInitialString(String string) {
        System.out.println(string);
    }

    public static void buildReverseString(String string) {
        StringBuffer buffer = new StringBuffer(string);
        buffer.reverse();
        System.out.println("Reverse string is " + buffer);
    }

}
