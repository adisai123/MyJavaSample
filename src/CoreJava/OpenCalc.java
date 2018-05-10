package CoreJava;

import java.io.IOException;


public class OpenCalc
{

    public static void main(String argp[]) throws IOException
    {
        Runtime.getRuntime().exec("calc");// will open a new calculator
    }
}
