package org.xiao.patterns.ch14proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * 代理模式测试
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:42
 */

public class ProxySubjectTest {

    @Test
    public void test() {
        Subject subject = new ProxySubject();
        subject.request();
    }

    @Test
    public void test2() {
        RealSubject subject = new RealSubject();

        InvocationHandler handler = new DynamicSubject(subject);

        Subject proxy = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), handler.getClass().getInterfaces(), handler);
        proxy.request();

    }


}