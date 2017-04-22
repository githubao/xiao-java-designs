package org.xiao.patterns.ch00compound;

/**
 * 订阅者类
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:36
 */

public interface QuackObserver {
    void update(Quackable duck);
}
