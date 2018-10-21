package com.academy.telesens.Homework05;

import java.util.regex.Pattern;

public class Task03a {
//Даты. найти строки сответствующие этому шаблону: YYYY/MM/DD HH:MM(:SS)
    public static void main(String[] args) {
        String regex = "\\d{4}/(([0][1-9])|([1][0-2]))/(([0][1-9])|([1-2][0-9])|([3][01]))\\s(([01][0-9])|([2][1-4])):([0-5][0-9])";
        String[] stringArray = {"2012/09/18 12:10", "2013/09/09 09:09", "2013/9/09 09:09"};

        for (int i = 0; i < stringArray.length; i++) {
            boolean result = Pattern.matches(regex, stringArray[i]);
            if (result) {
                System.out.println(stringArray[i]);
            }
        }
    }
}

