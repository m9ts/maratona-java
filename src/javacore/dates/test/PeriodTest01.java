package javacore.dates.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);
        Period period = Period.between(now, nowAfterTwoYears);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofWeeks(58);
        Period period4 = Period.ofMonths(3);
        Period period5 = Period.ofYears(2);

        System.out.println(period);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(period3.getDays())));
    }
}
