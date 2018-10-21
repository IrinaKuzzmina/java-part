package com.academy.telesens.Homework06;

public class TestAbonent {

    static Abonent abonent1 = new Abonent(1, "July", "Grin", 25, 'f');
    static Abonent abonent2 = new Abonent(1, "July", "Grin", 25, 'f');
    static Abonent abonent3 = new Abonent(2, "Mary", "Olsen", 28, 'f');
    static Abonent abonent4 = new Abonent("Kate", "Olsen", 30, 'f');

    public static void main(String[] args) {
        abonent1.isEquals(abonent2);
        abonent1.isEquals(abonent3);
        abonent1.isEquals(abonent4);
    }
}
