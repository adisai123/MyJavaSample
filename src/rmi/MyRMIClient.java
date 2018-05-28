package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


/**
 * 1.Create the remote interface 2.Provide the implementation of the remote interface 3.Compile the implementation class and create the stub and
 * skeleton objects using the rmic tool 4. Start the registry service by rmiregistry tool 5.Create and start the remote application 6.Create and start
 * the client application
 * 
 * @author aditya.malpani
 *
 */
public class MyRMIClient
{

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException
    {
        MyRMIInteface s = (MyRMIInteface) Naming.lookup("rmi://localhost:5000/aditya");
        System.out.println(s.add());
    }
}
