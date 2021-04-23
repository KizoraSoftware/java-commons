package com.core;

public class DateFormat {
   public static String lastDateofTheMonth(int year, int month) {
       YearMonth yearMonth = YearMonth.of(year, month);
       LocalDate last = yearMonth.atEndOfMonth();
       return last.toString;
   }
   
}
