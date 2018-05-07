package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


/**
 * 
 * @author aditya.malpani
 *
 */
public class ReadFromSocketStream extends Thread
{

    Socket s;


    public ReadFromSocketStream(Socket s)
    {
        this.s = s;
    }


    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                BufferedReader read = new BufferedReader(new InputStreamReader(s.getInputStream()));
                String sss = read.readLine();
                System.out.println(sss);
                if (sss.equalsIgnoreCase("stop"))
                {
                    break;
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                s.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
