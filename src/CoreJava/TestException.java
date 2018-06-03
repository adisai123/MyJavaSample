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


    private void name() throws InterruptedException
    {
        int i = 0;
        Runnable x = new Runnable()
        {

            public void run()
            {
                System.out.println("kjkkj" + i);
            }
        };
        class x
        {

            private void name()
            {
                System.out.println("jh" + i);
            }
        }
        try
        {
            x xx = new x();
            xx.name();
            Thread u = new Thread(x);
            u.start();
            u.join();
            System.exit(1);
            throw new RuntimeException();
        }
        finally
        {
            System.out.println("khkgh");
        }
    }
}
