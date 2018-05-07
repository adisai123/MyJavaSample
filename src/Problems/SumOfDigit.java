package Problems;

public class SumOfDigit
{

    public static void main(String[] args)
    {
        SumOfDigit myDigit = new SumOfDigit();
        myDigit.sumOfDigit(123);
    }
    // 100%10 = 0 100/10 =10
    // 10%10 = 0 10/10 = 1


    //
    public long sumOfDigit(long n)
    {
        int a = 0;
        while (n != 0)
        {
            a += (int) n % 10;
            n = n / 10;
            System.out.println(n);
        }
        return a;
    }
}
