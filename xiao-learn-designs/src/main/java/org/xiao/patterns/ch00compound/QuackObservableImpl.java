package org.xiao.patterns.ch00compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 订阅者的具体实现
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:32
 */

public class QuackObservableImpl implements QuackObservable {
    ArrayList<QuackObserver> observers = new ArrayList<>();

    Quackable duck;

    public QuackObservableImpl(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(QuackObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iter = observers.iterator();
        while (iter.hasNext()) {
            QuackObserver observer = (QuackObserver) iter.next();
            observer.update(duck);
        }
    }
}
