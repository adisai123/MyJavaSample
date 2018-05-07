package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class BlockSequenceTesting
{

    static
    {
        System.out.println("static block");
    }
    {
        System.out.println("normal block");
    }


    public BlockSequenceTesting()
    {
        System.out.println("In constructor");
    }


    public static void main(String[] args)
    {
        new BlockSequenceTesting();
        System.out.println("static main");
        try
        {
            Class.forName("CoreJava.anotherClass");
            Class.forName("CoreJava.anotherClass");
            ClassLoader.getSystemClassLoader();
            // Class.forName("java8.blockSequenceTesting");
            // anotherClass a = null;
            anotherClass a = new anotherClass();
            a.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


class anotherClass
{

    static
    {
        {
            System.out.println("testing static block without calling its object");
        }
        System.out.println("hi");
    }
    {
        {
            System.out.println("non - static");
        }
    }


    public anotherClass()
    {
        System.out.println("gf");
    }
}
/*
 * interface f {
 * 
 * static { System.out.println("hi"); } } interface can not define initializer
 */