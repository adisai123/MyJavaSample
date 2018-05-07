package CoreJava;

public class CallByReference
{

    int i;


    public static void main(String[] args)
    {
        CallByReference callByReference = new CallByReference();
        callByReference.i = 100;
        callByReference.display(callByReference);
        System.out.println(callByReference.i);
    }


    public void display(CallByReference c)
    {
        System.out.println(c.getIntValue());
    }


    private int getIntValue()
    {
        return i;
    }
}
