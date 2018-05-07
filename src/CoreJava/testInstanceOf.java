package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class testInstanceOf implements Myinterface
{

    public static void main(String[] args)
    {
        testInstanceOf name = new testInstanceOf();
        // I wanted to see what true will be considered while display
        System.out.println(true);
        System.out.println(name instanceof Object);
        System.out.println(name instanceof child);
        child myChild = new child();
        System.out.println(myChild instanceof testInstanceOf);
        myChild = null;
        System.out.println(myChild instanceof testInstanceOf);
        System.out.println(name instanceof Myinterface);
    }
}


// remember implements will never come before extends
class child extends testInstanceOf implements Myinterface
{
}


interface Myinterface
{
}