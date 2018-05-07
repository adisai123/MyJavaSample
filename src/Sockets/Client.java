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
public class Client
{

    public static void main(String[] args)
    {
        try
        {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String clientName = bf.readLine();
            Socket writer = new Socket("localhost", 8080);
            // @SuppressWarnings("resource")
            // ServerSocket s = new ServerSocket(8081);
            // Socket reader = s.accept();
            new WriteToSocketStream(writer, clientName).start();
            new ReadFromSocketStream(writer).start();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
