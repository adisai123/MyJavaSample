package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class MyRMIServer
{

    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, AlreadyBoundException
    {
        MyRMIInteface s = new MyRemoteClass();
        Naming.rebind("rmi://localhost:5000/aditya", s);
        // Skeleton sub = (Skeleton) Naming.lookup("rmi://localhost:5000/aditya");
        // System.out.println(sub.add());
    }
}
