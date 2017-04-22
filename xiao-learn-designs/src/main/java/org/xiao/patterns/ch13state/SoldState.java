package org.xiao.patterns.ch13state;

/**
 * 售卖状态
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 14:42
 */

public class SoldState implements State {
    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("please wait, we are already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("turing twice makes no sense");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if (machine.getCount() > 0) {
            machine.setState(machine.getNoQuarterState());
        } else {
            machine.setState(machine.getSoldOutState());
        }

    }
}
