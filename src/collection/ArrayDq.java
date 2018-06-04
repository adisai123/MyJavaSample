package collection;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDq
{

    public static void main(String[] args)
    {
        Deque<String> dq = new ArrayDeque<String>();
        dq.addLast("asd");
        dq.push("23234");
        dq.add("asdasd");
        // dq.add(null); null not allowed
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq.poll());
        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}
