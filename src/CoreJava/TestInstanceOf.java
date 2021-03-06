package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class TestInstanceOf implements Myinterface
{

    public static void main(String[] args)
    {
        TestInstanceOf name = new TestInstanceOf();
        // I wanted to see what true will be considered while display
        System.out.println(true);
        System.out.println(name instanceof Object);
        System.out.println(name instanceof ChildTest);
        ChildTest myChild = new ChildTest();
        System.out.println(myChild instanceof TestInstanceOf);
        myChild = null;
        System.out.println(myChild instanceof TestInstanceOf);
        System.out.println(name instanceof Myinterface);
    }
}


// remember implements will never come before extends
class ChildTest extends TestInstanceOf implements Myinterface
{
}


interface Myinterface
{
}