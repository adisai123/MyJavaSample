package multithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class WaitNotifyExample
{

    public static void main(String argp[])
    {
        WaitNotify waitNotifyObject = new WaitNotify();
        new Thread(() -> {
            try
            {
                waitNotifyObject.rwO.readFromFile();
            }
            catch (InterruptedException | IOException e)
            {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try
            {
                waitNotifyObject.rwO.writeToFile();
            }
            catch (InterruptedException | IOException e)
            {
                e.printStackTrace();
            }
        }).start();
    }
}


class WaitNotify
{

    ReadWriteO rwO = new ReadWriteO();
}


class ReadWriteO
{

    File f = new File("myTexting.txt");
    BufferedReader bfR = null;
    BufferedWriter bfW = null;
    {
        try
        {
            f.createNewFile();
            bfR = new BufferedReader(new FileReader(f));
            bfW = new BufferedWriter(new FileWriter(f));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    public synchronized void readFromFile() throws InterruptedException, IOException
    {
        this.wait();
        System.out.println("Read someting from the myTexting.txt file.");
        String s = bfR.readLine();
        while (s != null)
        {
            System.out.println(s);
            s = bfR.readLine();
        }
    }


    public synchronized void writeToFile() throws InterruptedException, IOException
    {
        System.out.println("write someting to the myTexting.txt file:type exit to end up writting");
        String write = new String();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (!write.equalsIgnoreCase("break"))
        {
            write = bufferedReader.readLine();
            bfW.write(write);
            bfW.newLine();
        }
        bfW.flush();
        System.out.println("end");
        this.notifyAll();
    }
}