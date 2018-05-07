package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class Assignment
{
    ;

    int u;


    public static void main(String[] args)
    {
        char a = 'a';
        int i = a;
        short j = 10;
        // a = j; not works ? both stores 2 byte
        // short j=a; not works ? both store 2 bytes
        // a = a + 10; not works ?
        // a = a + a; not work ?
        // a = 'a' + 20000; works
        // a += a; works
        // a++; works
        System.out.println(a);
        System.out.println(j + i);
        try
        {
            throw new StackOverflowError();
        }
        catch (StackOverflowError e)
        {
            System.out.println("hi");
        }
    }
}
