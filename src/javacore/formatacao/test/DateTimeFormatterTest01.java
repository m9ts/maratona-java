package javacore.formatacao.test;

// format -> transformando um objeto para String
// parse -> transformando String para objeto

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20251212", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);

        LocalDate parse2 = LocalDate.parse("2025-12-12", DateTimeFormatter.ISO_DATE);
        System.out.println(parse2);

        LocalDate parse3 = LocalDate.parse("2025-12-12", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);

        LocalDateTime parse4 = LocalDateTime.parse("2025-12-12T15:15:51.457");
        System.out.println(parse4);

        // define padrão de data
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("12/12/2025", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("12.Dezember.02025", formatterGR);
        System.out.println(parseGR);
    }
}
