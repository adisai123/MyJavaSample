package java8New;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author aditya.malpani
 *
 */
public class TypeReferenrence
{

    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        @SuppressWarnings("rawtypes")
        List<Integer> l = new ArrayList<>();
        l.add(1);
        TypeReferenrence tf = new TypeReferenrence();
        tf.name(l);
        l.forEach(tf::names);
    }


    private void name(List<Integer> list)
    {
        list.add(100);
        list.forEach((t) -> {
            System.out.println(t);
        });
        System.err.println(list);
    }


    private void names(Integer i)
    {
        System.err.println(++i);
    }
}
