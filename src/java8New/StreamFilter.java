package java8New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFilter
{

    static List<String> s = new ArrayList<String>();


    public static void main(String[] args)
    {
        s.add("aditya");
        s.add("malpani");
        s.add("asdd");
        List<String> outp = s.stream().filter(servicesTransaction -> !servicesTransaction.equalsIgnoreCase("aditya")).collect(Collectors.toList());
        for (Iterator iterator = outp.iterator(); iterator.hasNext();)
        {
            String string = (String) iterator.next();
            System.out.println(string);
        }
    }
}
