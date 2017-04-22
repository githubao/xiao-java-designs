package org.xiao.patterns.ch00compound;

/**
 * 装饰器模式，计数器
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:09
 */

public class QuackCounter implements Quackable {
    Quackable duck;

    private static int count;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        QuackCounter.count = count;
    }

    @Override
    public void registerObserver(QuackObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
