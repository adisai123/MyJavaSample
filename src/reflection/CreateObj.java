package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class CreateObj
{

    public int y;


    private CreateObj()
    {
        System.out.println(y = 19);
    }


    private void display()
    {
        System.out.println("h:" + y);
    }


    public static void main(String[] args)
    {
        try
        {
            @SuppressWarnings("unchecked")
            Class<CreateObj> x = ((Class<CreateObj>) Class.forName("reflection.CreateObj"));
            CreateObj dd = ((CreateObj) x.newInstance());
            System.out.println(dd.y = 10);
            System.out.println(dd.y++ + 9);
            System.out.println(++dd.y);
            Constructor<CreateObj> ss = x.getDeclaredConstructor();
            CreateObj sh = ss.newInstance();
            System.out.println(++sh.y + 2);
            java.lang.reflect.Method m = x.getDeclaredMethod("display", null);
            m.setAccessible(true);
            m.invoke(dd, null);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException
                | IllegalArgumentException | InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
}
