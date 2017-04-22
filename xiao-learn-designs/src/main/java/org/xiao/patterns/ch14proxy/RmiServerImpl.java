package org.xiao.patterns.ch14proxy;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * rmi 模式测试
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:28
 */

public class RmiServerImpl extends UnicastRemoteObject implements RmiServer {
    @Override
    public String saySth() throws RemoteException {
        return "i am from server";
    }

    public RmiServerImpl() throws RemoteException {
    }

    ;

    public static void main(String[] args) {
        try {
            RmiServer service = new RmiServerImpl();

            Naming.bind("RemoteSay", service);
        } catch (AlreadyBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
