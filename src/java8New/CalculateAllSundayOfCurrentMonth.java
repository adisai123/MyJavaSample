package java8New;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;


public class CalculateAllSundayOfCurrentMonth
{

    public static void main(String s[])
    {
        LocalDate currentDate = LocalDate.now();
        LocalDate s1 = Year.now().atMonth(currentDate.getMonthValue()).atDay(1);
        System.out.println("testing");
        while (s1.getMonth() == currentDate.getMonth())
        {
            System.out.println(s1);
            s1 = s1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        }
        System.out.println(currentDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
