package javacore.dates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

// Duration não aceita LocalDate -> UnsupportedTemporalTypeException
// não aceita a unidade de tempo segundos

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime localTime = LocalTime.now();
        LocalTime localTimeMinus7Hours = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(localTime, localTimeMinus7Hours);
        Duration duration3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration4 = Duration.ofDays(20);
        Duration duration5 = Duration.ofMinutes(3);
        Duration duration6 = Duration.ofDays(365);
        Duration duration7 = Duration.ofMinutes(300);

        System.out.println("Diferença de tempo entre agora e agora -2 anos: " + duration);
        System.out.println("Diferença de tempo entre a hora local e a hora -7h: " + duration2);
        System.out.println("Diferença de tempo entre agora e e agora + 1000s: " + duration3);
        System.out.println("Horas em 20 dias: " + duration4);
        System.out.println("Minutos: " + duration5);
        System.out.println("Horas em um ano: " + duration6);
        System.out.println("300 minutos em horas: " + duration7);

    }
}
