package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Generics
{

    public static void main(String[] args)
    {
        List<x> x = new ArrayList<x>();
        x.add(new x());
        x.add(new y());
        addToGeneroic(x);
    }


    // ? super means you can add x and all the downward children.
    // <?> is different from <Object> ? means - you can access and pass any list
    // ? extends x means can use x and child of x but not parents
    public static void addToGeneroic(List<? super x> mylist)
    {
        // public static void addToGeneroic(List<? extends x> mylist)
        // {
        mylist.add(new x());
        mylist.add(new y());
        mylist.add(new z());
        Iterator i = mylist.iterator();
        for (Iterator iterator = mylist.iterator(); iterator.hasNext();)
        {
            Object object = (Object) iterator.next();
            if (object instanceof y)
            {
                ((y) object).myMethodY();
            }
            else if (object instanceof x)
            {
                ((x) object).myMethod();
            }
        }
    }
}


class x
{

    void myMethod()
    {
        System.out.println("In the class x");
    }
}


class y extends x
{

    void myMethodY()
    {
        System.out.println("in the class y");
    }
}


class z extends y
{

    void myMethodZ()
    {
        System.out.println("in the class Z");
    }
}
