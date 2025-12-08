package javacore.dates.test;

import java.time.Instant;
import java.time.LocalDateTime;

// zulu time/UTC -> horário mundial padrão (Meridiano de Greenwich)

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
        System.out.println("LocalDateTime: " + LocalDateTime.now());
        System.out.println("EpochSecond: " + now.getEpochSecond());
        System.out.println("Nanossegundo: " + now.getNano());
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3, 1_000_000_000));
        System.out.println(Instant.ofEpochSecond(3, -1_000_000_000));
    }
}
