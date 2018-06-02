package java8New;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.LongStream;


/**
 * 
 * @author aditya.malpani
 *
 */
public class java8LongStream
{

    public static void main(String... args)
    {
        LongStream ls = LongStream.range(1l, 100l);
        // ls = LongStream.empty();
        OptionalDouble oD = ls.average();
        // ls.forEach(System.out::println);
        System.out.println(oD);
        String i[] = {"aditya", "malpani"};
        String ss = "aditya";
        if (Arrays.stream(i).anyMatch(s -> ss.equals("aditya")))
        {
            System.out.println("hi" + ss);
        }
        // default value will be given to each element of array even if it is created in the method.
        int imt[] = new int[10];
        int js = 0;
        System.out.println(js);
        for (int j = 0; j < imt.length; j++)
        {
            System.out.println(imt[j]);
        }
    }
}
