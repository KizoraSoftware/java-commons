package com.core;

public class DateFormat {

    public static Boolean isLeapYear(String date){
        LocalDate localDate = LocalDate.parse(date);
        Boolean isLeap = localDate.isLeapYear();
        return isLeap;
    }
}
