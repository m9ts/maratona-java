package javacore.dates.test;

import java.util.Calendar;
import java.util.Date;

// Calendar é uma classe abstrata
// não pode ser instanciada diretamente

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana.");
        }
        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Dia da semana no mês: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 3);
        calendar.roll(Calendar.HOUR, 4);
        System.out.println("Números de semanas no ano: " + calendar.getWeeksInWeekYear());
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
