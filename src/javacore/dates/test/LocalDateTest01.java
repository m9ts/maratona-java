package javacore.dates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());

        LocalDate date = LocalDate.of(2026, Month.OCTOBER, 28);
        LocalDate agora = LocalDate.now();
        LocalDate nascimento = LocalDate.of(1995, 5, 23);
        System.out.println("Data de nascimento: " + nascimento);

        System.out.println("Ano: " + date.getYear());
        System.out.println("Mês: " + date.getMonth());
        System.out.println("Número do mês: " + date.getMonthValue());
        System.out.println("Dia do mês: " + date.getDayOfMonth());
        System.out.println("Dia da semana: " + date.getDayOfWeek());
        System.out.println("Dia do ano: " + date.getDayOfYear());
        System.out.println("É ano bissexto? " + date.isLeapYear());
        System.out.println("Data (yyyy-MM-dd): " + date);
        System.out.println("Data usando ChronoField.YEAR: " + date.get(ChronoField.YEAR));

        System.out.println("Dia do ano atual: " + LocalDate.now().getDayOfYear());
        System.out.println("Data de hoje: " + agora);

        // Conversão de String para LocalDate
        String dataTexto = "2025-12-05";
        LocalDate convData = LocalDate.parse(dataTexto);
        System.out.println("Data convertida (String -> LocalDate): " + convData);

    }
}
