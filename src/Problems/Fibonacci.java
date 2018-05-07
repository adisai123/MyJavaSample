package Problems;

public class Fibonacci
{

    @SuppressWarnings("static-access")
    public static void main(String[] at)
    {
        Fibonacci f = new Fibonacci();
        f.printFibonacci(10);
    }


    static void printFibonacci(long length)
    {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (long i = 0; i < length - 1; i++)
        {
            System.out.print(b + " ");
            b = a + b;
            a = b - a;
        }
    }
}
