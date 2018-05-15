package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class CallableExecutorTask implements Callable<Integer>
{

    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        CallableExecutorTask e = new CallableExecutorTask();
        // e.call();
        ExecutorService s = Executors.newFixedThreadPool(2);
        Future f = s.submit(e);
        System.out.println(f.get());
    }


    @Override
    public Integer call() throws Exception
    {
        System.out.println("3+3");
        return 9;
    }
}
