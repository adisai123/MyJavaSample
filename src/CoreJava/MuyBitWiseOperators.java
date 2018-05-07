package CoreJava;

/**
 * 
 * @author aditya.malpani
 *
 */
public class MuyBitWiseOperators
{

    public static void main(String[] args)
    {
        int i = 100;
        for (i = 0; i < 10; i++)
            System.out.println("%:" + (i % 2) + ">>: " + (i >> 1) + "<<: " + (i << 1) + ">>>: " + (i >>> 1) + "&: " + (i & i) + "|: " + (i | 1)
                    + "~: " + (~i) + "^: " + (i ^ 1));
        System.out.println("");
        for (i = 0; i < 10; i++)
            System.out.println("%" + (i % 2) + ">>" + (i >> 1) + "<<" + (i << 1) + ">>>" + (i >>> 1) + "&" + (i & i) + "|" + (i | 1) + "~" + (~i)
                    + "^" + (i ^ 1));
    }
}
