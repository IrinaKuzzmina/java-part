package com.academy.telesens.Homework05;


import java.util.regex.Pattern;

public class Task06 {
    static String text = "Cat cat dog cat dog";
    static String regex = "(\\s|\\.|,)";
    static Pattern pattern = Pattern.compile(regex);

    static String[] array = pattern.split(text);

    public static void main(String[] args) {
        int count = 0;
        for (  int i = 0; i < array.length; i++) {
            count =0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }

            System.out.println(array[i] + " - " + count + " раз");
        }

    }
}



