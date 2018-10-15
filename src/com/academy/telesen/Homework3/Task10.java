package com.academy.telesen.Homework3;
/*Реализовать программу, которая:
        -принимает строку
        -выводит массив слов, которые содержат символ @

        Например:
        Входная строка:
        "Если возникли вопросы обращайтесь в службу поддержки support@gmail.com или central.office@mail.com"
        Результат:
        [support@gmail.com, central.office@mail.com]*/

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String string = lineEnter();
        findEmails(string);
    }

    public static String lineEnter() {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        return string;
    }

    public static void findEmails(String string) {
        String[] array;
        for (String element : string.split(" ")) {
            if (element.contains("@")) {
                System.out.println(element);
            }
        }


    }
}
