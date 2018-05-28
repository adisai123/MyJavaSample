package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparatorAndComparable
{

    public static void main(String arg[])
    {
        List<MyItems> list = new ArrayList<MyItems>();
        list.add(new MyItems(3, "pencil"));
        list.add(new MyItems(1, "Pen"));
        list.add(new MyItems(5, "cap"));
        list.add(new MyItems(2, "sharpner"));
        display(list);
        System.out.println("--------sort using comparable-------------------");
        Collections.sort(list);
        display(list);
        System.out.println("--------sort by Id-------------------");
        list.sort((x, y) -> {
            return x.id - y.id;
        });
        display(list);
        System.out.println("---------sort by name----------------");
        list.sort((x, y) -> {
            return x.name.compareToIgnoreCase(y.name);
        });
        display(list);
    }


    private static void display(List<MyItems> list)
    {
        list.forEach((x) -> {
            System.out.println(x.id + ":" + x.name);
        });
    }
}


class MyItems implements Comparable<MyItems>
{

    int id;
    String name;


    public MyItems(int id, String name)
    {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(MyItems o)
    {
        return name.compareToIgnoreCase(o.name);
    }
}