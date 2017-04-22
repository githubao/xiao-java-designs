package org.xiao.patterns.ch00compound;

/**
 * 实际的鸭子工厂类
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:14
 */

public class DuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
