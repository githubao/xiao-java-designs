package org.xiao.patterns.ch14proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务器端
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:27
 */

public interface RmiServer extends Remote {
    String saySth() throws RemoteException;

}
