package org.xiao.patterns.ch00compound;

/**
 * 能叫的东西
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:58
 */

public interface Quackable extends QuackObservable{
    void quack();
}
