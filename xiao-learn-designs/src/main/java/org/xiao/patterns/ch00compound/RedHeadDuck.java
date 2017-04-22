package org.xiao.patterns.ch00compound;

/**
 * 红头鸭
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:59
 */

public class RedHeadDuck implements Quackable {
    QuackObservable observable;

    public RedHeadDuck() {
        observable = new QuackObservableImpl(this);
    }

    @Override
    public void quack() {
        System.out.println("readhad duck quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedHeadDuck{" +
                "observable=" + observable +
                '}';
    }
}
