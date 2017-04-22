package org.xiao.patterns.ch00compound;

/**
 * 具体的订阅者
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:37
 */

public class Quackologist implements QuackObserver {
    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist: " + duck + "just quacked!");
    }
}
