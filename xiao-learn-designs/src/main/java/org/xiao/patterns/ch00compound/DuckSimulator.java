package org.xiao.patterns.ch00compound;

import org.xiao.patterns.ch08adapter.Duck;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 鸭子模拟器
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 16:02
 */

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.quack3();
    }

    private void quack() {
        ArrayList<Quackable> quackList = new ArrayList<>();
//        quackList.add(new QuackCounter(new RedHeadDuck()));
//        quackList.add(new QuackCounter(new RubberDuck()));
//        quackList.add(new QuackCounter(new GooseAdapter(new Goose())));

        CountingDuckFactory duckFactory = new CountingDuckFactory();
        quackList.add(duckFactory.createRedHeadDuck());
        quackList.add(duckFactory.createRubberDuck());

        for (Quackable quackable : quackList) {
            quackable.quack();
        }
        System.out.println(String.format("total quack %s times", QuackCounter.getCount()));
    }

    private void quack2() {
        QuackList quackList = new QuackList();
//        quackList.add(new QuackCounter(new RedHeadDuck()));
//        quackList.add(new QuackCounter(new RubberDuck()));
//        quackList.add(new QuackCounter(new GooseAdapter(new Goose())));

        CountingDuckFactory duckFactory = new CountingDuckFactory();
        quackList.add(duckFactory.createRedHeadDuck());
        quackList.add(duckFactory.createRubberDuck());

        quackList.quack();
        System.out.println(String.format("total quack %s times", QuackCounter.getCount()));
    }

    private void quack3() {
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable rubberDuck = new RubberDuck();

        QuackObserver quackologist = new Quackologist();
        redHeadDuck.registerObserver(quackologist);
        rubberDuck.registerObserver(quackologist);

        redHeadDuck.quack();
        rubberDuck.quack();
    }
}
