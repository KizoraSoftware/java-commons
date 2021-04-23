package com.core;

public class DateFormat {
    public static int weekofTheYear(String date){
        String format = "yyyy-MM-dd";

        SimpleDateFormat df = new SimpleDateFormat(format);
        Date pdate = df.parse(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(pdate);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        return week;
    }
}
