package org.xiao.patterns.ch14proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 客户端代码
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:32
 */

public class RmiClient {

    public void go() {
        try {
            RmiServer service = (RmiServer) Naming.lookup("rmi://127.0.0.1/RemoteSay");

            System.out.println(service.saySth());

        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new RmiClient().go();
    }

}
