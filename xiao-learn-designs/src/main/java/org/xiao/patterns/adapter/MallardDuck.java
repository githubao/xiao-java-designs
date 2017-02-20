package org.xiao.patterns.adapter;

/**
 * 绿头鸭
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 19:35
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("mallard duck quack");
    }

    @Override
    public void fly() {
        System.out.println("mallard duck flying");
    }
}
