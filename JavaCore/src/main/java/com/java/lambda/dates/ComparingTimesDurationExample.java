package com.java.lambda.dates;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {

    public static void main(String[] args) {

        LocalTime wakeUpTime = LocalTime.of(7, 20);

        LocalTime breakFirstTime = LocalTime.of(8, 20);

        long minutesDiff = wakeUpTime.until(breakFirstTime, ChronoUnit.MINUTES); // the end time is always exclusive
        System.out.printf("%d %s Gap between wake up and Break first \n" ,minutesDiff, ChronoUnit.MINUTES.toString());

        Duration duration = Duration.between(wakeUpTime, breakFirstTime);
        System.out.println("duration  : " + duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(3);
        System.out.println(duration2.toMinutes());


        /**
         * LocalDateTime
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 8, 13, 23, 59);

        Duration duration3 = Duration.between(localDateTime, localDateTime1);

        System.out.println(duration3.toDays());

        /**
         * LocalDate - not supported
         */

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2018, 8, 13);

        //Duration duration4 = Duration.between(localDate, localDate1);
        //System.out.println(duration4.toDays());


    }
}
