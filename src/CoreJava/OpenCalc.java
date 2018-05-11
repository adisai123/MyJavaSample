package CoreJava;

import java.io.IOException;


public class OpenCalc
{

    public static void main(String argp[]) throws IOException
    {
        Runtime.getRuntime().exec("calc");// will open a new calculator
        // Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
        // Runtime.getRuntime().exec("shutdown -r -t 0");
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
