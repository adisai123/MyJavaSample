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
