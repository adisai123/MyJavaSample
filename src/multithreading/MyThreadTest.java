package multithreading;

public class MyThreadTest
{

    public static void main(String[] args)
    {
        Runnable r = () -> {
            for (int i = 0; i < 100000; i++);
            System.out.println("in current thread");
            System.out.println(Thread.activeCount());
        };
        System.out.println(Thread.activeCount());
        Thread t = new Thread(r);
        t.start();
        System.out.println(Thread.activeCount());
        System.out.println("end of main method");
    }
}
