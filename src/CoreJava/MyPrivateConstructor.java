package CoreJava;

class ObjectMethoda implements Cloneable
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
        System.out.println("kj");
        MyPrivateConstructor ss = new MyPrivateConstructor();
        ss.clone();
        // you can not clone in other class ss.clone() unless u override it with public , clone is native mehod
    }
}


public class MyPrivateConstructor extends Object implements Cloneable
{

    int x;
    MyPrivateConstructor ss = new MyPrivateConstructor();
    {
        try
        {
            MyPrivateConstructor myClone = (MyPrivateConstructor) ss.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }


    MyPrivateConstructor()
    {
        x = 20;
        System.out.println("hi");
    }
}