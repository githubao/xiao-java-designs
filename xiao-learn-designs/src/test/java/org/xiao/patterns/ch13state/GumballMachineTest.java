package org.xiao.patterns.ch13state;


import org.junit.Test;

/**
 * 糖果自动售卖机
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 15:11
 */

public class GumballMachineTest {

    @Test
    public void test() {
        GumballMachine machine = new GumballMachine(5);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine);

        machine.ejectQuarter();
        System.out.println(machine);

    }

}