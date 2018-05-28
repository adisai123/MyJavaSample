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
        callByReference.change(788);
        callByReference.display(callByReference);
        System.out.println(callByReference.i);
    }


    public void display(CallByReference c)
    {
        System.out.println(c.getIntValue());
        c = new CallByReference();
        c.i = 0;
    }


    void change(int i)
    {
        i = i + 100;// changes will be in the local variable only
        this.i = i;// will reflect with the help of this
    }


    private int getIntValue()
    {
        return i;
    }
}
