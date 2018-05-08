package snippet;

public class regularExpression
{

    public static void main(String[] args)
    {
        long freeMemory = Runtime.getRuntime().freeMemory();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("hi");
        }));
        String s = "aditya9aditya".replaceAll("(^aditya|aditya$)", "a");
        System.out.println(s);
    }
}
