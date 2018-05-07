package Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


/**
 * 
 * @author aditya.malpani
 *
 */
public class WriteToSocketStream extends Thread
{

    Socket s;
    String writerName;


    /**
     * 
     * @param s
     */
    public WriteToSocketStream(Socket s, String writerName)
    {
        super();
        this.s = s;
        this.writerName = writerName;
    }


    /**
     * executes logic.
     */
    public void run()
    {
        try
        {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            while (true)
            {
                PrintWriter pf = new PrintWriter(s.getOutputStream(), true);
                String writes = writerName + ":" + bf.readLine();
               // System.out.println(writes);
                pf.println(writes);
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
