package multithreading;

public class Join
{

    public static void main(String[] args) throws InterruptedException
    {
        // Thread t = new Thread(Join::new); constructor reference is not allowed
        Thread t1 = new Thread(new Join()::myrunMethod);
        Thread t2 = new Thread(new Join()::myrunMethod);
        Thread t3 = new Thread(new Join()::myrunMethod);
        Thread t4 = new Thread(new Join()::myrunMethod);
        Thread t5 = new Thread(new Join()::myrunMethod);
        // Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.if we combine
        // both setDemon and join it will definitely complete its execution.
        t1.setDaemon(true);
        t1.start();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");
        t2.start();
        t1.join();
        t3.start();
        t4.start();
        t5.start();
    }


    Join()
    {
        System.out.println("hi");
    }


    public void myrunMethod()
    {
        for (int i = 0; i < 100; i++)
            System.out.println(i + ":" + Thread.currentThread().getName());
    }
}
