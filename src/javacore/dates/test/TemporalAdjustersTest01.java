package javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20);
        now = now.with(ChronoField.DAY_OF_MONTH, 9);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println("Próxima sexta-feira: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
        System.out.println("Última sexta-feira: " + now);
        System.out.println("Dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Primeiro dia do mês: " + now + " | Dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Último dia do mês: " + now + " | Dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println("Primeiro dia do próximo ano: " + now + " | Dia da semana: " + now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("Primeiro dia do próximo mês: " + now + " | Dia da semana: " + now.getDayOfWeek());
    }

}
