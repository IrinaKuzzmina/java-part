package com.academy.telesen.Homework2;

import java.util.Random;
import java.util.Scanner;

public class ArrayFiller2 {
    public static void main(String[] args) {
        System.out.println("Please, enter the array length");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] array = new int[length];
        Random rand = new Random();
        System.out.print("[");
        int i = 0;
        while (i < array.length) {
            array[i] = rand.nextInt();
            if (i == array.length - 1) {
                System.out.print(array[i]);
                i++;
            } else
                System.out.print(array[i] + ", ");
            i++;
        }
        System.out.print("]");
    }
}

