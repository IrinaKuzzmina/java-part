package com.academy.telesen.Homework3;

/*Имеем массивы строк:String[] allUsers = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};
String[] firstPartOfUsers = new String[4];
String[] secondPartOfUsers = new String[4];

Скопировать первые 4 имени из массива allUsers в массив firstPartOfUser
Скопировать последние 4 имени из массива allUsers в массив secondPartOfUsers
Вывести массивы allUsers, firstPartOfUsers, secondPartOfUsers на консоль
Проверить, равны ли массивы по содержимому:  firstPartOfUsers, secondPartOfUsers*/

import java.util.Arrays;

import static java.util.Arrays.sort;

public class FromPresentation1 {
    static String[] allUsers = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};

    public static void main(String[] args) {
        printArray(allUsers);
        String[] firstPartOfUsers = createFirstPartUsers(allUsers);
        String[] secondPartOfUsers = createSecondPartUsers(allUsers);
        printArray(firstPartOfUsers);
        printArray(secondPartOfUsers);
        compareArrays(firstPartOfUsers, secondPartOfUsers);
    }

    public static String[] createFirstPartUsers(String[] allUsers) {
        String[] firstPartOfUsers = new String[4];
        firstPartOfUsers = Arrays.copyOfRange(allUsers, 0, 4);
        return firstPartOfUsers;
    }

    public static String[] createSecondPartUsers(String[] allUsers) {
        String[] secondPartOfUsers = new String[4];
        secondPartOfUsers = Arrays.copyOfRange(allUsers, 4, 8);
        return secondPartOfUsers;
    }

    public static void printArray(String[] users) {
        System.out.println(Arrays.toString(users));
    }

    public static void compareArrays(String[] firstPartOfUsers, String[] secondPartOfUsers) {
        Arrays.sort(firstPartOfUsers);
        Arrays.sort(secondPartOfUsers);
        if (Arrays.equals(firstPartOfUsers,secondPartOfUsers)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are different");
        }
    }
}
