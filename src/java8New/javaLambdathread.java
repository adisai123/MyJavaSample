package java8New;

/**
 * 
 * @author aditya.malpani
 *
 */
public class javaLambdathread
{

    public static void main(String args[]) throws InterruptedException
    {
        Thread t1 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                int i = 0;
                for (i = 0; i < 1000000000; i++);
                System.out.println("t1");
            }
        });
        Thread t2 = new Thread(new Runnable()
        {

            @Override
            public void run()
            {
                int i = 0;
                for (i = 0; i < 10; i++)
                {
                }
                System.out.println(" t2");
            }
        });
        Thread t = new Thread(() -> {
            int i = 0;
            for (i = 0; i < 10; i++)
            {
            }
            System.out.println("Lamda t0");
        });
        Thread t0 = new Thread(() -> {
            int i = 0;
            for (i = 0; i < 10; i++)
            {
            }
            System.out.println("Lamda t00");
        });
        t1.start();
        t.start();
        t0.start();
        t1.join();
        t2.start();
        // t1.join();
        // t.start();
    }
}
