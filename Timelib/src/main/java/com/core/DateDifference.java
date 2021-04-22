package com.core;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;


public class DateDifference {

    public static Duration getDifference(String fromDate, String toDate) {
        LocalDateTime from = LocalDateTime.parse(fromDate);
        LocalDateTime to = LocalDateTime.parse(toDate);
        return getDifference(from, to);
    }

    public static Duration getDifference(String fromDate, String toDate, ZoneOffset offset) {
        LocalDateTime from = LocalDateTime.parse(fromDate).atOffset(offset).toLocalDateTime();
        LocalDateTime to = LocalDateTime.parse(toDate).atOffset(offset).toLocalDateTime();
        return getDifference(from, to);
    }

    public static Duration getDifference(Long fromDate, Long toDate) {
        LocalDateTime from = LocalDateTime.ofEpochSecond(fromDate, 0, ZoneOffset.UTC);
        LocalDateTime to = LocalDateTime.ofEpochSecond(toDate, 0, ZoneOffset.UTC);
        return getDifference(from, to);
    }

    public static Duration getDifference(Long fromDate, Long toDate, ZoneOffset offset) {
        LocalDateTime from = LocalDateTime.ofEpochSecond(fromDate, 0, offset);
        LocalDateTime to = LocalDateTime.ofEpochSecond(toDate, 0, offset);
        return getDifference(from, to);
    }

    public static Duration getDifference(LocalDateTime fromDate, LocalDateTime toDate) {
        return Duration.between(fromDate, fromDate);
    }

    public static Double getDifferenceHours(String fromDate, String toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 3600.0);
    }

    public static Double getDifferenceHours(Long fromDate, Long toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 3600.0);
    }

    public static Double getDifferenceHours(LocalDateTime fromDate, LocalDateTime toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 3600.0);
    }

    public static Double getDifferenceMinutes(String fromDate, String toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 60.0);
    }

    public static Double getDifferenceMinutes(Long fromDate, Long toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 60.0);
    }

    public static Double getDifferenceMinutes(LocalDateTime fromDate, LocalDateTime toDate) {
        Duration gap = getDifference(fromDate, toDate);
        return (gap.getSeconds() / 60.0);
    }

    public static Long getDifferenceSeconds(String fromDate, String toDate) {
        return getDifference(fromDate, toDate).getSeconds();
    }

    public static Long getDifferenceSeconds(Long fromDate, Long toDate) {
        return getDifference(fromDate, toDate).getSeconds();
    }

    public static Long getDifferenceSeconds(LocalDateTime fromDate, LocalDateTime toDate) {
        return getDifference(fromDate, toDate).getSeconds();
    }

    public static Long getDifferenceMilliSeconds(String fromDate, String toDate) {
        return getDifference(fromDate, toDate).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(Long fromDate, Long toDate) {
        return getDifference(fromDate, toDate).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(LocalDateTime fromDate, LocalDateTime toDate) {
        return getDifference(fromDate, toDate).get(ChronoUnit.MILLIS);
    }

}
