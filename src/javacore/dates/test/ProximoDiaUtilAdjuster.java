package javacore.dates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ProximoDiaUtilAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        LocalDate date = LocalDate.from(temporal);
        DayOfWeek dia = date.getDayOfWeek();

        LocalDate proximoDiaUtil;

        switch (dia) {
            case FRIDAY:
                proximoDiaUtil = date.plusDays(3); // Segunda
                break;
            case SATURDAY:
                proximoDiaUtil = date.plusDays(2); // Segunda
                break;
            case SUNDAY:
                proximoDiaUtil = date.plusDays(1); // Segunda
                break;
            default:
                proximoDiaUtil = date.plusDays(1); // Dia útil normal
                break;
        }

        return proximoDiaUtil;
    }
}
