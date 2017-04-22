package org.xiao.patterns.ch00compound;

/**
 * 订阅者
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:30
 */

public interface QuackObservable {
    void registerObserver(QuackObserver observer);

    void notifyObservers();
}
