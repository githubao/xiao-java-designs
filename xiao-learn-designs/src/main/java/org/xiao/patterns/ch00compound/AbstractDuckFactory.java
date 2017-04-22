package org.xiao.patterns.ch00compound;

/**
 * 抽象工厂模式
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:13
 */

public abstract class AbstractDuckFactory {
    abstract Quackable createRedHeadDuck();

    abstract Quackable createRubberDuck();
}
