package Problems;

/**
 * 
 * @author aditya.malpani
 *
 */
public class volatileTest implements Runnable
{

    volatile static int static_v;
    volatile int v;
    int normal;
    static int staticnormal;
    private static final Object mutex = new Object();


    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "B[static_v]" + static_v + " [volatile]" + v + " [normal]" + normal + " [staticnormal]"
                + staticnormal);
        synchronized (mutex)
        {
            ++static_v;
            ++v;
            ++normal;
            ++staticnormal;
        }
        try
        {
            Thread.sleep(10000l);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "A[static_v]" + static_v + " [volatile]" + v + " [normal]" + normal + " [staticnormal]"
                + staticnormal);
        synchronized (mutex)
        {
            ++static_v;
            ++v;
            ++normal;
            ++staticnormal;
        }
        System.out.println(Thread.currentThread().getName() + "C[static_v]" + static_v + " [volatile]" + v + " [normal]" + normal + " [staticnormal]"
                + staticnormal);
    }
}


class XX
{

    public static void main(String[] args)
    {
        volatileTest t = new volatileTest();
        volatileTest t2 = new volatileTest();
        for (int i = 0; i < 100000; i++)
        {
            Thread t1 = new Thread(t);
            t1.setName("t" + i);
            Thread tt1 = new Thread(t2);
            tt1.setName("tt" + i);
            tt1.start();
            t1.start();
        }
    }
}
