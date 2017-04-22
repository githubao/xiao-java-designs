package org.xiao.patterns.ch13state;

/**
 * 卖光了
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 14:42
 */

public class SoldOutState implements State {
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("you can not insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you can not eject, you have not inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, nut there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
