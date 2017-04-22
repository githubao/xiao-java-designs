package org.xiao.patterns.ch14proxy;

/**
 * 代理类的实现
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:40
 */

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("run in real subject");
    }
}
