package java8New;

import java.util.StringJoiner;


public class StringJoiners
{

    public static void main(String[] args)
    {
        StringJoiner s = new StringJoiner(",", "[", "]");
        s.add("asd");
        System.out.println(s);
    }
}
