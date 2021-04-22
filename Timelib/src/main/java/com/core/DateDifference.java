package com.core;


import java.time.*;
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

    public static Duration getDifference(String fromDate, String toDate, String zoneName) {
        LocalDateTime from = LocalDateTime.parse(fromDate);
        LocalDateTime to = LocalDateTime.parse(toDate);
        return getDifference(from, to, zoneName);
    }

    public static Duration getDifference(Long fromDate, Long toDate) {
        LocalDateTime from = LocalDateTime.ofEpochSecond(fromDate, 0, ZoneOffset.UTC);
        LocalDateTime to = LocalDateTime.ofEpochSecond(toDate, 0, ZoneOffset.UTC);
        return getDifference(from, to);
    }

    public static Duration getDifference(Long fromDate, Long toDate, ZoneOffset offset) {
        LocalDateTime from = LocalDateTime.ofEpochSecond(fromDate, 0, offset);
        LocalDateTime to = LocalDateTime.ofEpochSecond(toDate, 0, offset);
        return getDifference(from, to, offset);
    }

    public static Duration getDifference(Long fromDate, Long toDate, String zoneName) {
        LocalDateTime now = LocalDateTime.now();
        ZoneId zone = ZoneId.of(zoneName);
        ZoneOffset offset = zone.getRules().getOffset(now);
        LocalDateTime from = LocalDateTime.ofEpochSecond(fromDate, 0, offset);
        LocalDateTime to = LocalDateTime.ofEpochSecond(toDate, 0, offset);
        return getDifference(from, to, zoneName);
    }

    public static Duration getDifference(LocalDateTime fromDate, LocalDateTime toDate, ZoneOffset offset) {
        OffsetDateTime from = fromDate.atOffset(offset);
        OffsetDateTime to = toDate.atOffset(offset);
        return Duration.between(from, to);
    }

    public static Duration getDifference(LocalDateTime fromDate, LocalDateTime toDate, String zoneName) {
        ZoneId zoneId = ZoneId.of(zoneName);
        ZonedDateTime from = fromDate.atZone(zoneId);
        ZonedDateTime to = toDate.atZone(zoneId);
        return Duration.between(from, to);
    }

    public static Duration getDifference(LocalDateTime fromDate, LocalDateTime toDate) {
        return Duration.between(fromDate, fromDate);
    }

    public static Double getDifferenceHours(String fromDate, String toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 3600.0);
    }

    public static Double getDifferenceHours(Long fromDate, Long toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 3600.0);
    }

    public static Double getDifferenceHours(LocalDateTime fromDate, LocalDateTime toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 3600.0);
    }

    public static Double getDifferenceHours(String fromDate, String toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 3600.0);
    }

    public static Double getDifferenceHours(Long fromDate, Long toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 3600.0);
    }

    public static Double getDifferenceHours(LocalDateTime fromDate, LocalDateTime toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 3600.0);
    }

    public static Double getDifferenceHours(String fromDate, String toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 3600.0);
    }

    public static Double getDifferenceHours(Long fromDate, Long toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 3600.0);
    }

    public static Double getDifferenceHours(LocalDateTime fromDate, LocalDateTime toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 3600.0);
    }

    public static Double getDifferenceMinutes(String fromDate, String toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 60.0);
    }

    public static Double getDifferenceMinutes(Long fromDate, Long toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 60.0);
    }

    public static Double getDifferenceMinutes(LocalDateTime fromDate, LocalDateTime toDate) {
        return (getDifferenceSeconds(fromDate, toDate) / 60.0);
    }

    public static Double getDifferenceMinutes(String fromDate, String toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 60.0);
    }

    public static Double getDifferenceMinutes(Long fromDate, Long toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 60.0);
    }

    public static Double getDifferenceMinutes(LocalDateTime fromDate, LocalDateTime toDate, String zoneName) {
        return (getDifferenceSeconds(fromDate, toDate, zoneName) / 60.0);
    }

    public static Double getDifferenceMinutes(String fromDate, String toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 60.0);
    }

    public static Double getDifferenceMinutes(Long fromDate, Long toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 60.0);
    }

    public static Double getDifferenceMinutes(LocalDateTime fromDate, LocalDateTime toDate, ZoneOffset offset) {
        return (getDifferenceSeconds(fromDate, toDate, offset) / 60.0);
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

    public static Long getDifferenceSeconds(String fromDate, String toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).getSeconds();
    }

    public static Long getDifferenceSeconds(Long fromDate, Long toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).getSeconds();
    }

    public static Long getDifferenceSeconds(LocalDateTime fromDate, LocalDateTime toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).getSeconds();
    }

    public static Long getDifferenceSeconds(String fromDate, String toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).getSeconds();
    }

    public static Long getDifferenceSeconds(Long fromDate, Long toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).getSeconds();
    }

    public static Long getDifferenceSeconds(LocalDateTime fromDate, LocalDateTime toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).getSeconds();
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

    public static Long getDifferenceMilliSeconds(String fromDate, String toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(Long fromDate, Long toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(LocalDateTime fromDate, LocalDateTime toDate, String zoneName) {
        return getDifference(fromDate, toDate, zoneName).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(String fromDate, String toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(Long fromDate, Long toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).get(ChronoUnit.MILLIS);
    }

    public static Long getDifferenceMilliSeconds(LocalDateTime fromDate, LocalDateTime toDate, ZoneOffset offset) {
        return getDifference(fromDate, toDate, offset).get(ChronoUnit.MILLIS);
    }
}
