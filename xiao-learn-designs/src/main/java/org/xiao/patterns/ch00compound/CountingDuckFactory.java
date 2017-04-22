package org.xiao.patterns.ch00compound;

/**
 * 可以实现计数的鸭子工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:15
 */

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createRedHeadDuck() {
        return new QuackCounter(new RedHeadDuck());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
