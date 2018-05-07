package multithreading;

public class Palindrome
{

    public static void main(String[] args)
    {
        int i = 121, n = 0;
        do
        {
            n = ((i % 10)) + n * 10;
            i = i / 10;
            System.out.println(n);
        }
        while (i > 0);
        if (n == i)
        {
            System.out.println("Number is Palindrome");
        }
    }
}
