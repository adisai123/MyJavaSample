package CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Snipp
{

    public static void main(String[] args)
    {
        Pattern p = null;
        Matcher m = null;
        int count = 0;
        String s = "aadityna OO +  aditya -12j aditya & () asfdsf112567893334";
        p = Pattern.compile("[^ a-z|A-z|0-9|\\s ]{1}");
        m = p.matcher(s);
        while (m.find())
        {
            count++;
        }
        System.out.println("Number of special" + count);
        p = Pattern.compile("[\\s]{1}");
        m = p.matcher(s);
        count = 0;
        while (m.find())
        {
            count++;
        }
        System.out.println("Number of white spaces" + count);
        count = 0;
        p = Pattern.compile("[0-9&&1-5&&3-8]{1}");
        m = p.matcher(s);
        while (m.find())
        {
            System.out.print(m.group(0));
            count++;
        }
        System.out.println("Number of alphabets" + count);
    }
}
