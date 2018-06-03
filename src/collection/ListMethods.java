package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;
import java.util.Vector;


public class ListMethods
{

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList();
        LinkedList<String> linkedList = new LinkedList();
        Vector<String> vector = new Vector();
        Stack<String> stact = new Stack();
        stact.push("sditya");
        stact.add("malpani");
        stact.push("aditya");
        stact.push("vasanti");
        System.out.println(stact.pop() + "\n" + stact);
        stact.forEach(System.out::println);
        List s = stact.subList(2, 3);
        s.add("asd");
        System.out.println("=============================");
        s.forEach(System.out::println);
        System.out.println("=============================");
        stact.forEach(System.out::println);
        linkedList.addAll(stact);
        System.out.println("========================");
        linkedList.forEach(System.out::println);
        s.add("dds");
        s.listIterator();
        System.out.println(linkedList.containsAll(s) + ":" + stact.containsAll(s));
        System.out.println("========================");
        for (Iterator<String> iterator = linkedList.descendingIterator(); iterator.hasNext();)
        {
            // linkedList.add("asdasd");
            System.out.println(iterator.next());
        }
        System.out.println("-0000-----------");
        for (java.util.ListIterator<String> sss = linkedList.listIterator(); sss.hasNext();)
        {
            System.out.println(sss.next());
            // System.out.println(sss.previous());
            // sss.remove();
            sss.add("asdasd");
            // System.out.println(sss.next());
        }
        System.out.println("---------------");
        System.out.println(linkedList);
        linkedList.retainAll(stact);
        System.out.println("---------------------");
        System.out.println(linkedList);
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("adiaty");
        stringJoiner.add("adiaty");
        stringJoiner.add("adiaty");
        stringJoiner.add("adiaty");
        System.out.println(stringJoiner);
        System.out.println(stringJoiner.length());
    }
}
