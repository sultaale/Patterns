package com.sultaale.patterns.proxy.rmi;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.SayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
