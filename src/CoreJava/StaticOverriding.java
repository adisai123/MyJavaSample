package CoreJava;

import CoreJava.StaticOverriding.Child;


public class StaticOverriding
{

    static void display()
    {
        System.out.println("StaticOverriding");
        class innerstaticClass
        {
            // static block is not allowed
            // static
            // {
            // System.out.println("ji");
            // }
        }
        new innerstaticClass();
    }


    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        StaticOverriding s = new StaticOverriding();
        Child d = new Child();
        s.display();
        d.display();
        d.main();
        // x xxy = (x) new StaticOverriding(); CoreJava.StaticOverriding cannot be cast to CoreJava.x
        x x = new x();
        x.display();
        x xx = new x();
        xx.display();
    }

    // non static inner classes can not have static methods or blocks
    static class Child extends StaticOverloading
    {

        {
            System.out.println("dsad");
            class uiy
            {
            }
        }
        {
        }
        static
        {
            System.out.println("ji");
            class uiy
            {
            }
        }


        static void display()
        {
            System.out.println("inner classes");
        }


        // protected is same as default + respect Parent child irrespective of package
        protected void main()
        {
            System.out.println("dasd");
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
class x extends Child
{

    static void display()
    {
        x x = new x();
        System.out.println("x");
        x.myMain();
        // super can not be used with the static
        Child.display();
    }


    void myMain()
    {
        main();
    }
}
// class Child extends StaticOverloading
// {
// } commented this line as you can not have same class name in the same package but inner classes are possible (same is applicable for enum and
// interface)