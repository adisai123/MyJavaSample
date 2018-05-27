package snippet;

public class regularExpression
{

    public regularExpression()
    {
        try
        {
            System.out.println(100 / 0);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }


    public void display()
    {
        System.out.println(this.hashCode());
    }


    public static void main(String[] args)
    {
        long freeMemory = Runtime.getRuntime().freeMemory();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("hi");
        }));
        String s = "aditya9aditya".replaceAll("(^aditya|aditya$)", "a");
        System.out.println(s);
        new regularExpression().display();
    }
}
