package java8New;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class DayOfWeekExample1
{

    public static void main(String[] args)
    {
        // LocalDate localDate = LocalDate.of(2016, 03, 31);
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DayOfWeek dayOfWeek = DayOfWeek.of(2);
        localDate = localDate.with(TemporalAdjusters.next(dayOfWeek));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(df.format(localDate));
    }
}
