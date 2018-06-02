package CoreJava;

public class TestException
{

    Runnable x = new Runnable()
    {

        public void run()
        {
            System.out.println("kjkkj");
        }
    };


    public static void main(String[] args)
    {
        try
        {
            Thread u = new Thread(new TestException().x);
            u.start();
            // u.join();
            new TestException().name();
        }
        catch (Exception e)
        {
            System.out.println();
        }
    }


    private void name()
    {
        try
        {
            System.exit(1);
            throw new RuntimeException();
        }
        finally
        {
            System.out.println("khkgh");
        }
    }
}
