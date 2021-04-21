package com.core;

public class DateFormat {
    public static Boolean isLeapYear(String date){
        LocalDate dt1 = LocalDate.parse(date);
        return dt1.isLeapYear();
    }
}
