package uz.bakhromjon.OOP;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 17/12/22, Sat
 **/
public class ObjectAndObjectVariables {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate birthday = LocalDate.of(2002, Month.SEPTEMBER, 6);
        LocalDate plus = birthday.plus(1, ChronoUnit.DAYS);
        System.out.println(plus);


        GregorianCalendar someDay = new GregorianCalendar(1999, 11, 31);
        someDay.add(Calendar.DAY_OF_MONTH, 1000);

        System.out.println("-------------------------");
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print(" ");

        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
    }
}
