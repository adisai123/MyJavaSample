package java8New;

public class LambdaTest
{

    public static void main(String[] args)
    {
        x x = (a, b) -> (a + b);
        System.out.println(x.mytest(10, 10));
        y y = (int a, int b) -> {
            return a + b;
        };
        System.out.println(y.mytest(10, 20));
    }
}


interface x
{

    int mytest(int a, int b);
}


interface y
{

    int mytest(int a, int b);
}