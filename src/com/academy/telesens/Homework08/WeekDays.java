package com.academy.telesens.Homework08;

public enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void getDayBeforeYesterday (){
        WeekDays weekDay = values()[(ordinal() + 5) %values().length];
        System.out.println(weekDay);
    }

    public void getDayAfterTomorrow (){
        WeekDays weekDay = values()[(ordinal() + 2) %values().length];
        System.out.println(weekDay);
    }


}
