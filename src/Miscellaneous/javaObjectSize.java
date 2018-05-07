package Miscellaneous;

import java.lang.instrument.Instrumentation;


/**
 * 
 * @author aditya.malpani
 *
 */
public class javaObjectSize
{

    private static volatile Instrumentation myInstrument;


    public static void premain(final String s, final Instrumentation i)
    {
        System.out.println("" + s);
        myInstrument = i;
    }


    public static void agentmain(String s, Instrumentation i)
    {
        System.out.println("" + s);
        myInstrument = i;
    }


    public static long getObjectSize(final Object o)
    {
        if (myInstrument == null)
        {
            throw new IllegalStateException("Agent not initialized.");
        }
        return myInstrument.getObjectSize(o);
    }


    public static void main(String[] args)
    {
        javaObjectSize j = new javaObjectSize();
        System.out.println(InstrumentationAgent.getObjectSize(j));
    }
}
