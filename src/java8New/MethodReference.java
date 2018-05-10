package java8New;

/**
 * 
 * @author aditya.malpani
 *
 */
public class MethodReference
{

    public MethodReference()
    {
        System.out.println("hilhdsf");
    }


    public MethodReference(int i)
    {
        System.out.println("hilhdsf");
    }


    public static void main(String[] args)
    {
        f constructor = MethodReference::new;
        constructor.myInterface(10);
        f statics = MethodReference::myMethod;
        statics.myInterface(10);
        f instanceEx = new MethodReference()::myMethods;
        instanceEx.myInterface(10);
        Thread t = new Thread(AnotherExample::myrun1, "thread 1");
        Thread t2 = new Thread(new AnotherExample()::myrun2, "thread2");
        t.run();
        t2.run();
        t.start();
        t2.start();
    }


    static void myMethod(int i)
    {
        System.out.println("hi");
    }


    public void myMethods(int i)
    {
        System.out.println("instance");
    }
}


interface f
{

    void myInterface(int i);
}


class AnotherExample
{

    public static void myrun1()
    {
        for (int i = 0; i < 10; i++)
            System.out.println("run1");
    }


    public void myrun2()
    {
        for (int i = 0; i < 10; i++)
            System.out.println("run2");
    }
}
