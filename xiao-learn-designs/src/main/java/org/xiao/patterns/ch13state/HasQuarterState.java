package org.xiao.patterns.ch13state;

/**
 * 有硬币状态
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 14:43
 */

public class HasQuarterState implements State {
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("quarter returned");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
