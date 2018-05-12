package multithreading;

public class ThreadGroups
{

    public static void main(String[] args) throws InterruptedException
    {
        ThreadGroup tg = new ThreadGroup("My thread");
        Thread t1 = new Thread(tg, ThreadGroups::run1);
        Thread t2 = new Thread(tg, ThreadGroups::run2);
        Thread t3 = new Thread(tg, ThreadGroups::run3);
        t1.setDaemon(true);
        t2.setDaemon(true);
        t3.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        tg.list();
        // tg.wait(1000);
        // tg.interrupt();
        // tg.resume();
        System.out.println(tg.activeCount());
    }


    public static void run1()
    {
        System.out.println("before1");
        try
        {
            Thread.currentThread().sleep(100000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("run1");
    }


    public static void run2()
    {
        System.out.println("before2");
        try
        {
            Thread.currentThread().sleep(100000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("run2");
    }


    public static void run3()
    {
        System.out.println("before3");
        try
        {
            Thread.currentThread().sleep(100000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("run3");
    }
}
