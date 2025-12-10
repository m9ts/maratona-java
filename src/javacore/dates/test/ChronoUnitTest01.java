package javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDate aniversario = LocalDate.of(2005, 10, 28);
        System.out.println("Diferença de dias entre o dia do meu nascimento até o dia atual: " + ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de semanas entre a semana do meu nascimento até a semana atual: " + ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de meses entre o mês do meu nascimento até o mês atual: " + ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println("Diferença de anos entre o ano do meu nascimento até o ano atual: " + ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));

        LocalDate manuAniv = LocalDate.of(2005, 4, 19);
        System.out.println("Diferença de dias entre o aniversário da Manu e o meu: " + ChronoUnit.DAYS.between(manuAniv, aniversario) + " dias");
        System.out.println("Idade da Manu em semanas: " + ChronoUnit.WEEKS.between(manuAniv, LocalDate.now()) + " semanas");
        System.out.println("Diferença de semanas entre o aniversário da Manu e o meu: " + ChronoUnit.WEEKS.between(manuAniv, aniversario) + " semanas");

        LocalDate rafaAniv = LocalDate.of(2004, 02, 26);
        System.out.println(ChronoUnit.DAYS.between(rafaAniv, aniversario));

        LocalDate maeAniv = LocalDate.of(1976, 12, 5);
        LocalDate paiAniv = LocalDate.of(1975, 10, 27);
        LocalDate grandmaAniv = LocalDate.of(1950, Month.MARCH, 23);

        System.out.println(ChronoUnit.DAYS.between(paiAniv, maeAniv));

        System.out.println(ChronoUnit.DAYS.between(maeAniv, LocalDate.now()));
        System.out.println(ChronoUnit.WEEKS.between(maeAniv, LocalDate.now()));
        System.out.println(ChronoUnit.DAYS.between(paiAniv, LocalDate.now()));
        System.out.println(ChronoUnit.WEEKS.between(paiAniv, LocalDate.now()));
        System.out.println(ChronoUnit.DAYS.between(grandmaAniv, LocalDate.now()));

    }
}
