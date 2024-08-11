package com.sultaale.patterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    String SayHello() throws RemoteException;
}
