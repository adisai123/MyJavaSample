package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class MethodOverloading
{

    public static void main(String[] args)
    {
        MethodOverloading m = new MethodOverloading();
        m.mm(1, 1);
    }


    public String mm(Integer i, Integer j)
    {
        System.out.println("sysout");
        return null;
    }


    protected int mm(int a, int b)
    {
        System.out.println("jhgjhg");
        return 0;
    }


    public void mm(byte b, byte j)
    {
        System.out.println("ss");
    }


    public int mm(long n, long m)
    {
        System.out.println("ss");
        return 0;
    }


    public void mm(Long n, Long m)
    {
        System.out.println("lh");
    }


    public void mm(int... a)
    {
        System.out.println("hihlk");
    }
}
