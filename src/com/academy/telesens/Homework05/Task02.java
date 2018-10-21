package com.academy.telesens.Homework05;

import java.util.regex.Pattern;

public class Task02 {
    static String regexFormat = "^\\d+([.,]?\\d{1,2})?(руб|грн|\\$)$";
    static String[] stringArray = {"0.50грн", "0.5грн", "12,45руб", "123$", "123.00$"};

    /*
    Создать регулярное выражение для поиска несоответствия строки  шаблонy денежного формата:
                - цифры разделенные точкой или запятой
                - разделителя может не быть
                - после разделителя должна быть одна или две цифры
                - в конце должен находится литерал, обозначающий валюту из набора: грн руб $
     */
    public static void main(String[] args) {
        boolean result = testCurrencyFormat(regexFormat, stringArray);
        System.out.println(result);
    }
    public static boolean testCurrencyFormat(String regexFormat, String[] stringArray) {
        boolean result = true;
        for (int i = 0; i < stringArray.length; i++) {
            result = result && Pattern.matches(regexFormat, stringArray[i]);
        }
        return result;
    }
}
