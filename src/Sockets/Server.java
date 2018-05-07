package Sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * 
 * @author aditya.malpani
 *
 */
public class Server
{

    public static void main(String[] args)
    {
        ServerSocket s;
        try
        {
            s = new ServerSocket(8080);
            while (true)
            {
                Socket reader = s.accept();
                new WriteToSocketStream(reader, "server").start();
                new readFromSocketStream(reader).start();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
