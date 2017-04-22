package org.xiao.patterns.ch00compound;

/**
 * 适配器模式
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:08
 */

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(QuackObserver observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
