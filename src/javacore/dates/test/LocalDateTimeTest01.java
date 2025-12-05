package javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora atual: " + localDateTime);

        LocalDate date = LocalDate.parse("2025-12-05");
        LocalTime time = LocalTime.parse("04:45:00");

        System.out.println("Data: "+ date);
        System.out.println("Hora: " + time);

        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
