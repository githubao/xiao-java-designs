package org.xiao.patterns.ch14proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:43
 */

public class DynamicSubject implements InvocationHandler {
    private Object instance;

    public DynamicSubject(Object instance) {
        this.instance = instance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("run in dynamic proxy");
        method.invoke(instance, args);
        return null;
    }
}
