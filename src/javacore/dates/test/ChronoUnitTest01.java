package javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(2005, 10, 28);
        System.out.println("Diferença de dias entre o dia do meu nascimento até o dia atual: " + ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de semanas entre a semana do meu nascimento até a semana atual: " + ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de meses entre o mês do meu nascimento até o mês atual: " + ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de anos entre o ano do meu nascimento até o ano atual: " + ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
    }
}
