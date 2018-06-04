package collection;

import java.util.HashSet;
import java.util.Set;


public class MyHashSet
{

    public static void main(String[] args)
    {
        Set s = new HashSet<>();
        s.add(new m(10));
        s.add(new m(299));
        s.add(new m(234234));
        s.add(new m(10));
        s.add(new m(299));
        s.add(new m(234234));
        s.add(null);
        s.add(null);
        System.out.println(s.size());
        s.forEach(System.out::println);
    }
}


class m
{

    public m(int i)
    {
        this.i = i;
    }

    int i;


    public String toString()
    {
        return Integer.toString(i);
    }


    public int hashCode()
    {
        return i;
    }


    public boolean equals(Object M)
    {
        return ((m) M).i == this.i;
    }
}
