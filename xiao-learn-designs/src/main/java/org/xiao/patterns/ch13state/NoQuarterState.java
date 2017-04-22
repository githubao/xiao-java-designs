package org.xiao.patterns.ch13state;

/**
 * 没有硬币状态
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 14:42
 */

public class NoQuarterState implements State {
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you insert a quarter");
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have not inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first");
    }
}
