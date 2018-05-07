package CoreJava;

public class StringMemoryCheck
{

    static Runtime myRunTime = Runtime.getRuntime();


    public static void main(String[] args)
    {
        long startTime = getCurrentTime();
        myRunTime.addShutdownHook(new Thread(() -> {
            System.out.println("I am first shutdown hook");
            System.out.println("----------------Before shutdown-------------------------");
            getMemoryInfo();
            System.out.println("--------------------------------------------------------");
            System.err.println("TotalTime taken to run this program" + (getCurrentTime() - startTime) + "ms");
        }));
        System.out.println("Initial Memory");
        System.out.println("-----------------------------------------");
        getMemoryInfo();
        System.out.println("-----------------------------------------");
        StringBuffer s = new StringBuffer("aditya");
        for (int i = 0; i < 100; i++)
        {
            s.append(i);
        }
        getMemoryInfo();
        String ss = "aditya";
        for (int i = 0; i < 100; i++)
        {
            ss = ss + 'a';
        }
        System.out.println("-----------------------------------------");
        getMemoryInfo();
    }


    private static void getMemoryInfo() throws StackOverflowError, ArrayIndexOutOfBoundsException
    {
        System.out.println("Total Memory:" + myRunTime.totalMemory());
        System.out.println("Max Memory:" + myRunTime.maxMemory());
        System.out.println("Total Free Memory:" + myRunTime.freeMemory());
    }


    private static long getCurrentTime()
    {
        return System.currentTimeMillis();
    }
}
