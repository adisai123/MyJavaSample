package java8New;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFilter
{

    static List<String> s = new ArrayList<String>();


    public static void main(String[] args) throws IOException
    {
        s.add("aditya");
        s.add("malpani");
        s.add("asdd");
        List<String> outp = s.stream().filter(servicesTransaction -> !servicesTransaction.equalsIgnoreCase("aditya")).collect(Collectors.toList());
        for (Iterator<String> iterator = outp.iterator(); iterator.hasNext();)
        {
            String string = (String) iterator.next();
            System.out.println(string);
        }
        File f = new File("file.txt");
        System.out.println(f.getName());
        System.out.println(f.getCanonicalFile());
        System.out.println(f.getAbsoluteFile());
    }
}
