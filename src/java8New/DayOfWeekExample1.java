package java8New;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;


public class DayOfWeekExample1
{

    public static void main(String[] args)
    {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        // LocalDate localDate = LocalDate.of(2016, 03, 31);
        // LocalDate localDate = LocalDate.now();
        LocalDateTime localDate = LocalDateTime.parse("31-Mar-2016 00:00:00", df);
        System.out.println(localDate);
        DayOfWeek dayOfWeek = DayOfWeek.of(2);
        localDate = localDate.with(TemporalAdjusters.next(dayOfWeek));
        df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(df.format(localDate));
    }
}
