package CoreJava;

public class Ascii
{

    public static void main(String[] args)
    {
        for (int i = 0; i < 256; i++)
        {
            System.out.printf("%d - %5c", i, i);
            System.out.println();
        }
    }
}
