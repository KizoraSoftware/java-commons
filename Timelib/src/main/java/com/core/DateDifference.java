package com.core;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class DateDifference {

    public static LocalDateTime getDifference(String fromDate, String toDate) {
        LocalDateTime  from = LocalDateTime.parse(fromDate);
        LocalDateTime  to = LocalDateTime.parse(toDate);
        return getDifference(from,to);
    }

    public static LocalDateTime getDifference(LocalDateTime fromDate, LocalDateTime toDate) {

        return Duration gap = Duration.between(time2, time1);;
    }

    public static LocalDateTime getDifference(Long fromDate, Long toDate) {
        Date diffDate = new Date();

        return diffDate;
    }

    public static Double getDifferenceHours(String fromDate, String toDate) {
        Double diffDate = 0.0;

        return diffDate;
    }

    public static Double getDifferenceHours(Date fromDate, Date toDate) {
        Double diffDate = 0.0;

        return diffDate;
    }

    public static Date getDifferenceHours(Long fromDate, Long toDate) {
        Date diffDate = new Date();

        return diffDate;
    }

    public static Double getDifferenceMinutes(String fromDate, String toDate) {
        Double diffDate = 0.0;

        return diffDate;
    }

    public static Double getDifferenceMinutes(Date fromDate, Date toDate) {
        Double diffDate = 0.0;

        return diffDate;
    }

    public static Date getDifferenceMinutes(Long fromDate, Long toDate) {
        Date diffDate = new Date();

        return diffDate;
    }

    public static Long getDifferenceSeconds(String fromDate, String toDate) {
        Long diffDate = 0L;

        return diffDate;
    }

    public static Long getDifferenceSeconds(Date fromDate, Date toDate) {
        Long diffDate = 0L;

        return diffDate;
    }

    public static Date getDifferenceSeconds(Long fromDate, Long toDate) {
        Date diffDate = new Date();

        return diffDate;
    }

    public static Long getDifferenceMilliSeconds(String fromDate, String toDate) {
        Long diffDate = 0L;

        return diffDate;
    }

    public static Long getDifferenceMilliSeconds(Date fromDate, Date toDate) {
        Long diffDate = 0L;

        return diffDate;
    }

    public static Date getDifferenceMilliSeconds(Long fromDate, Long toDate) {
        Date diffDate = new Date();

        return diffDate;
    }
}
