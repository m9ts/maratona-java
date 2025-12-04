package javacore.formatacao.test;

// classe abstrata
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) throws ParseException {
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        Locale localeGermany = Locale.GERMANY;
        Locale localeBR = new Locale("pt", "BR");
        Locale localeUS = Locale.US;


        NumberFormat[] numberFormats = new NumberFormat[6];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeIT);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeGermany);
        numberFormats[4] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[5] = NumberFormat.getCurrencyInstance(localeUS);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println("Moeda: " + numberFormat.format(valor));
        }

        String valorString = "￥1,000";

        try {
            System.out.println(numberFormats[1].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
