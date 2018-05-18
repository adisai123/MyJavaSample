package CoreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 
 * @author aditya.malpani
 *
 */
public class Wrappers
{

    public static void main(String[] args)
    {
        Integer k = new Integer(10);
        Integer i = 10;
        Integer j = 10;
        System.out.println(i == j);
        System.out.println(k == j);
        String s = "  aditya ! ads    ";
        Pattern pattern = Pattern.compile(".");
        Matcher m = pattern.matcher(s);
        while (m.find())
        {
            System.out.println(m.end());
            System.out.println(m.group(0));
        }
        System.out.println(s.trim().split("\\s")[1]);
        List ss = new ArrayList();
    }
}
