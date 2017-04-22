package org.xiao.patterns.ch00compound;

/**
 * 橡皮鸭
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:00
 */

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("rubber duck quack");
    }

    @Override
    public void registerObserver(QuackObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
