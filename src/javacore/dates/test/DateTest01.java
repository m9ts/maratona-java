package javacore.dates.test;

// classe obsoleta - "deprecated"
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // long que representa ms
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
