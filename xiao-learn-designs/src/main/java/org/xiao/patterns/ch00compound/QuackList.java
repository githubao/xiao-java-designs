package org.xiao.patterns.ch00compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合和迭代器模式
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:23
 */

public class QuackList implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable item) {
        quackers.add(item);
    }

    @Override
    public void quack() {
        Iterator iter = quackers.iterator();
        while (iter.hasNext()) {
            Quackable quacker = (Quackable) iter.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(QuackObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
