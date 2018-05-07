package CoreJava;

public class StaticOverriding
{

    static void display()
    {
        System.out.println("StaticOverriding");
    }


    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        StaticOverriding s = new StaticOverriding();
        child d = new child();
        s.display();
        d.display();
        // x xxy = (x) new StaticOverriding(); CoreJava.StaticOverriding cannot be cast to CoreJava.x
        x x = new x();
        x.display();
        StaticOverriding xx = new x();
        xx.display();
    }

    // non static inner classes can not have static methods or blocks
    static class child extends StaticOverloading
    {

        {
            System.out.println("dsad");
        }
        {
        }


        static void display()
        {
            System.out.println("inner classes");
        }


        void main()
        {
        }
    }
    interface xx
    {

        void d();
    }
    enum MyEnum {
    }
}


// we can extends inner classes
class x extends StaticOverriding implements xx
{

    static void display()
    {
        System.out.println("x");
    }
}
// class child extends StaticOverloading
// {
// } commented this line as you can not have same class name in the same package but inner classes are possible (same is applicable for enum and
// interface)