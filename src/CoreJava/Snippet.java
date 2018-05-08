package CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Snippet
{

    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        String stringPool = "aditya";
        String string = new String("anand");
        String string1 = new String("aditya");
        String intern = string.intern();
        System.out.println(stringPool == string);
        System.out.println(stringPool == intern);
        System.out.println(intern == string);
        System.out.println(intern == string1);
        System.out.println(string == string1);
        System.out.println(stringPool == string1);
        System.out.println("kgjh");
        System.out.println(stringPool.equals(string));
        System.out.println(stringPool.equals(intern));
        System.out.println(intern.equals(string));
        System.out.println("stringPool" + stringPool.hashCode());
        System.out.println("stringPool" + intern.hashCode());
        System.out.println("stringPool" + string.hashCode());
        System.out.println("stringPool" + string1.hashCode());
        String s[] = new String[]{};
        StringBuilder d = new StringBuilder("aditya");
        StringBuilder f = new StringBuilder("aditya");
        System.out.println("stringBuilder");
        System.out.println(d.equals(f));
        System.out.println(d.hashCode());
        System.out.println(f.hashCode());
        System.out.println("Total time taken in ms" + (startTime = System.currentTimeMillis() - startTime));
        System.out.println(hashcode(string.toCharArray()));
        int i = Integer.valueOf("10");
        System.out.println(i);
        String trimedString = " aditya Malpani ".trim();
        System.out.println(trimedString);
        String ref1 = "aditya";
        String ref2 = "aditya";
        System.out.println("check ref" + (ref1 == ref2));
        boolean b = Pattern.matches("[0-9]", "0");
        Pattern p = Pattern.compile(".*[0-9]+");
        p.splitAsStream(ref1).findAny();
        Matcher m = p.matcher("123123123-asddasd-234234-d-9");
        System.out.println(m.replaceAll("asd"));
        System.out.println(b);
    }


    static int hashcode(char arrp[])
    {
        int h = 0;
        if (h == 0 && arrp.length > 0)
        {
            char val[] = arrp;
            for (int i = 0; i < arrp.length; i++)
            {
                h = 31 * h + val[i];
            }
        }
        return h;
    }
}
