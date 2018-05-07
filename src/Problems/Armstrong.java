package Problems;

public class Armstrong
{

    public static void main(String arg[])
    {
        int i, n = 0, sum = 0, temp;
        i = (temp = 153);
        while (i > 0)
        {
            n = i % 10;
            sum += (n * n * n);
            i = i / 10;
        }
        System.out.println(sum);
        if (temp == sum)
        {
            System.out.println("ArmStrong");
        }
    }
}
