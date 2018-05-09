package CoreJava;

import java.io.IOException;


public class OverridingException
{

    public void display() throws IOException
    {
        System.out.println("ddd");
    }


    public static void main(String[] args) throws Exception
    {
        OverridingException e = new ChildException();
        e.display();
        OverridingException s = new OverridingException();
        s.display();
        e = s;
        e.display();
    }
}


class ChildException extends OverridingException
{

    // throws only required in case if super keyword is used to to call super class method and supper class method defined checked exception
    @Override
    public void display() throws IOException
    {
        System.out.println("hi");
        super.display();
    }
}