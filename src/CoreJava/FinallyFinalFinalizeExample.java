package CoreJava;

final public class FinallyFinalFinalizeExample
{

    final int x = 0;
    int y = 10;


    public static void main(String[] args) throws Exception
    {
        {
            try
            {
                // new FinallyFinalFinalizeExample().x = 100; once initialized you can not be modified.
                final FinallyFinalFinalizeExample f = new FinallyFinalFinalizeExample();
                // f = f; you can not assigne other object to it
                // f = new FinallyFinalFinalizeExample(); for
                int x2 = f.x;
                // f = null; will also thorws an error
                f.y++; // , but its content can be changed
                System.out.println(f.y);
                // System.exit(1); finally block will never run
                System.gc(); // it call finalize block.
                int i = 34 / 0;
                // if i++ instead if i = i+1; gives working of unused variable.
                i = i + 1;
                // System.exit(1); will never run because of Arithmetic exception
            }
            catch (Exception e)
            {
                System.out.println("asds");
            }
            finally
            {
                // without catch try-finally possible , it will terminate normal program i.e. next statements after the finally block will not be run.
                System.out.println("d");
            }
            System.out.println("hi");
        }
    }


    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("in final method");
        super.finalize();
        System.out.println("after return from super ");
    }
}
