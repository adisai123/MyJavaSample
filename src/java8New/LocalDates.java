package java8New;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class LocalDates {

	public static void main(String[] args)
	{
		//5 year(s) 5 month(s) 3 Day(s)
    	LocalDateTime  s = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    	LocalDateTime  dd = LocalDateTime.of(2018, Month.MAY, 12, 0, 0);
    	
    	Period ps = Period.between(dd.toLocalDate(),s.toLocalDate());
    	StringBuffer sb = new StringBuffer();
		if (ps.getYears() != 0)
        {
            sb.append(ps.getYears() + " year(s) ");
        }
        if (ps.getMonths() != 0)
        {
            sb.append(ps.getMonths() + " month(s) ");
        }
        sb.append(ps.getDays() + " Day(s) ");
    	System.out.println(sb);
    	LocalDateTime  ss = LocalDateTime.of(s.toLocalDate(), s.toLocalTime());
    	System.out.println(ss);
	}

}
