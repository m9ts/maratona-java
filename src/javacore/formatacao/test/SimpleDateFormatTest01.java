package javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brasil, ' dd 'de' MMMM 'de' yyyy";
        String pattern1 = "hh 'o''clock' a, zzzz";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern1);

        int day = SimpleDateFormat.DAY_OF_WEEK_FIELD;

        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(simpleDateFormat1.format(new Date()));
        System.out.println(day);

        try {
            System.out.println(simpleDateFormat.parse("Brasil,  04 de Dezembro de 2025"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
