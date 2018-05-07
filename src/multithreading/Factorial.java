package multithreading;

public class Factorial
{

    public static void main(String args[])
    {
        System.out.println(findFactorial(12));
    }


    public static long findFactorial(long number)
    {
        for (long i = number - 1; i > 1; i--)
        {
            number *= i;
        }
        return number;
    }
}
