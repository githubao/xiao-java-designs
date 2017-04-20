package org.xiao.patterns.ch08adapter;

/**
 * 测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 19:43
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        duck.quack();
        duck.fly();

        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }
}