package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class Skeleton extends UnicastRemoteObject implements MyRMIInteface
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    public Skeleton() throws RemoteException
    {
        super();
    }


    /*
     * (non-Javadoc)
     * 
     * @see rmi.MyInteface#add()
     */
    @Override
    public int add()
    {
        return 19;
    }


    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, AlreadyBoundException
    {
        Skeleton s = new Skeleton();
        Naming.rebind("rmi://localhost:5000/aditya", s);
        // Skeleton sub = (Skeleton) Naming.lookup("rmi://localhost:5000/aditya");
        // System.out.println(sub.add());
    }
}
