package javacore.formatacao.test;

// classe abstrata
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeGermany = Locale.GERMANY;
        Locale localeBR = new Locale("pt", "BR");


        NumberFormat[] numberFormats = new NumberFormat[5];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeJP);
        numberFormats[2] = NumberFormat.getInstance(localeIT);
        numberFormats[3] = NumberFormat.getInstance(localeGermany);
        numberFormats[4] = NumberFormat.getInstance(localeBR);

        double valor = 10_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println("Formatação numérica: " + numberFormat.format(valor));
        }

    }
}
