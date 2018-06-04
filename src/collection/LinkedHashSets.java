package collection;

import java.util.LinkedHashSet;


public class LinkedHashSets
{

    public static void main(String[] args)
    {
        LinkedHashSet s = new LinkedHashSet();
        s.add("asd");
        s.add("asdasd");
        s.add("asd");
        s.add("asdasd");
        System.out.println(s);
    }
}
