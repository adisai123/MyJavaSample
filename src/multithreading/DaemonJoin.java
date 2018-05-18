package multithreading;

public class DaemonJoin
{

    public static void main(String[] args) throws InterruptedException
    {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
            {
                System.out.println(i);
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.yield();
        t.join(); // with join daemon thread will not die until it finish
    }
}
