package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListIterators
{

    public static void main(String[] args)
    {
        List<String> i = new ArrayList();
        i.add("sd");
        i.add("asd");
        i.add("sdfsad");
        ListIterator<String> listIterator = i.listIterator(i.size());
        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }
}
