package com.core;

public class DateFormat {

    public static Boolean isLeapYear(String date){
        LocalDate localDate = LocalDate.parse(date);
        return localDate.isLeapYear();
    }
}
