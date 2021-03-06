package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool implements Runnable
{

    static int count;


    public void display()
    {
        System.out.println(this.hashCode());
    }


    public ThreadPool()
    {
        try
        {
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }


    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "count" + count++);
        for (int i = 0; i < count; i++)
        {
            System.out.println(Thread.currentThread().getName() + "count" + count++);
        }
    }


    public static void main(String argp[]) throws InterruptedException
    {
        ExecutorService executers = Executors.newFixedThreadPool(2);
        ThreadPool threadPool = new ThreadPool();
        threadPool.display();
        Thread t1 = new Thread(threadPool);
        t1.setName("t1");
        t1.setDaemon(true);
        t1.start();
        Thread t2 = new Thread(threadPool);
        t2.setName("t2");
        Thread t3 = new Thread(threadPool);
        Thread t4 = new Thread(threadPool);
        Thread t5 = new Thread(threadPool);
        Thread t6 = new Thread(threadPool);
        Thread t7 = new Thread(threadPool);
        Thread t8 = new Thread(threadPool);
        //
        t2.setDaemon(true);
        t3.setDaemon(true);
        t4.setDaemon(true);
        t5.setDaemon(true);
        t6.setDaemon(true);
        t7.setDaemon(true);
        t8.setDaemon(true);
        executers.execute(t1);
        executers.execute(t2);
        executers.execute(t3);
        executers.execute(t4);
        executers.execute(t5);
        executers.execute(t6);
        executers.execute(t7);
        executers.execute(t7);// you can pass same thread object twice
        System.out.println("isTerminated:" + executers.isTerminated());
        // executers.shutdown(); /** This program will never stop if you comments this line **/
        System.out.println("isShutdown" + executers.isShutdown());
        // you can not pass task to execute after the shutdown method is called
        /*
         * executers.execute(t1); executers.execute(t8);
         */
        t2.start(); // no issue to start t2 thread
    }
}
