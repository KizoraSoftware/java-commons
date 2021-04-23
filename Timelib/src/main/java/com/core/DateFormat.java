package com.core;

public class DateFormat {
    public int dayofTheYear(String date){
        LocalDate localDate = LocalDate.parse(date);
        int day = localDate.getDayOfYear();
        return day;
    }
}
