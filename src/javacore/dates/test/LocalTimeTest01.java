package javacore.dates.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();
        LocalTime time = LocalTime.of(23, 32, 13);

        System.out.println("Horário: " + time);
        System.out.println("Horário atual: " + agora);

        System.out.println("Hora: " + time.getHour());
        System.out.println("Minuto: " + time.getMinute());
        System.out.println("Segundo: " + time.getSecond());
        System.out.println("Hora inicial do dia: " + LocalTime.MIN);
        System.out.println("Hora final do dia: " + LocalTime.MAX);
    }
}
