package com.academy.telesens.Homework06;

public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2= new Date();
        date1.setDate("23", "10", "2018");
        date1.print();
        date2.setDate("31","12","2017");
        date2.print();
        Date.findDifferenceBetweenDates(date1,date2);
        date1.getDayOfWeek();
        System.out.println("The number of week in the year is "  + date1.getWeekOfYear());
        date1.nextDay();
        date1.nextMonth();
        date1.nextYear();
        date1.addDays(2005);
        Date date3= new Date("30","24","2018");
        System.out.println(date1.toString());
        DateTime dateTime1=new DateTime();
        dateTime1.setHours("05");
        System.out.println(dateTime1.toString());


    }
}
