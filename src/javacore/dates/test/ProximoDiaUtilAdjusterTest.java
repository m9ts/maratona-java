package javacore.dates.test;

import java.time.LocalDate;

public class ProximoDiaUtilAdjusterTest {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate proxDiaUtil = hoje.with(new ProximoDiaUtilAdjuster());

        System.out.println("Hoje: " + hoje + " (" + hoje.getDayOfWeek() + ")");
        System.out.println("Próximo dia útil: " + proxDiaUtil + " (" + proxDiaUtil.getDayOfWeek() +")");
    }
}
