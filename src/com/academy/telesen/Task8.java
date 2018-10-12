package com.academy.telesen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int length = getArrayLength();
        int[] array = fillArray(length);
        printInitialArray(array);
        int[] newArray = changeArrayElemOrder(array);
        printReverseArray(newArray);
        sortArray(newArray);
        printSortedArray(newArray);
    }

    public static int getArrayLength() {
        System.out.println("Please, enter the array length:");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        return length;
    }

    public static int[] fillArray(int length) {
        int[] array = new int[length];
        Random random = new Random(100);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static int[] changeArrayElemOrder(int[] array) {
        int[] newArray = new int[array.length];
        int i = 0;
        for (int j = array.length - 1; j >= 0; j--) {
            newArray[i] = array[j];
            i++;
        }
        return newArray;
    }

    public static void sortArray(int[] newArray) {
        Arrays.sort(newArray);
    }

    public static void printInitialArray(int[] array) {
        System.out.println("The initial array is the following:");
        System.out.println(Arrays.toString(array));
    }

    public static void printReverseArray(int[] newArray) {
        System.out.println("The reverse array is the following:");
        System.out.println(Arrays.toString(newArray));
    }

    public static void printSortedArray(int[] newArray) {
        System.out.println("The sorted array is the following:");
        System.out.println(Arrays.toString(newArray));
    }

}
