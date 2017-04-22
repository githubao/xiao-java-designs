package org.xiao.patterns.ch13state;

/**
 * 状态集的接口
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 14:40
 */

public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

}
