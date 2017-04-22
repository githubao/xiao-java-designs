package org.xiao.patterns.ch14proxy;

/**
 * 代理类的实现
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:41
 */

public class ProxySubject implements Subject {
    Subject subject = new RealSubject();

    @Override
    public void request() {
        System.out.println("run in proxy");
        subject.request();
    }
}
