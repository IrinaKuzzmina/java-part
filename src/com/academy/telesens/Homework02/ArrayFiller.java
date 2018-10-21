package com.academy.telesens.Homework02;

import java.util.Random;
import java.util.Scanner;

public class ArrayFiller {

    public static void main(String[] args) {
        System.out.println("Please, enter the array length");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        Random rand = new Random();
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            int from = 1;
            int to = 10;
            array[i] = rand.nextInt((to - from) + from);
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else
                System.out.print(array[i] + ", ");

        }
        System.out.print("]");
    }
}
