package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MyRMIInteface extends Remote
{

    int add() throws RemoteException;
}