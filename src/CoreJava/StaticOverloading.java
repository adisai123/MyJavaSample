package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class StaticOverloading
{

    static double m(double i)
    {
        System.out.println("m(double)");
        return i;
    }


    static double m(Integer i)
    {
        System.out.println("m(Integer)");
        return i;
    }


    static void m(int j, int... i)
    {
        System.out.println("m(int, int...)");
    }


    void m(int ni, long i)
    {
        System.out.println("m(int,int)");
    }


    void m(long ni, long i)
    {
        System.out.println("m(long,long)");
    }


    void m(double ni, double i)
    {
        System.out.println("m(double,double)");
    }


    void m(float ni, float i)
    {
        System.out.println("m(float,float)");
    }


    void m(float i, float j, float... k)
    {
        System.out.println(i);
    }


    public static void main(String[] args)
    {
        StaticOverloading name = new StaticOverloading();
        name.m(10, 20);
        name.m(20);
        name.m(20, 20, 20, 20);
        name.m(0.1, 0.2);
    }
}
