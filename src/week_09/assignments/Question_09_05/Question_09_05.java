package week_09.assignments.Question_09_05;

import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Current year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("\nAfter setTime:");
        gc.setTimeInMillis(1234567898765L);
        System.out.println("Current year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Current month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Current day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
