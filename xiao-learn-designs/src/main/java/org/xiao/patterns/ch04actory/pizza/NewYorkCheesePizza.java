package org.xiao.patterns.ch04actory.pizza;

/**
 * 纽约风味奶酪披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:18
 */
public class NewYorkCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("NewYork CHEESE prepare");
    }

    @Override
    public void bake() {
        System.out.println("NewYork CHEESE bake");
    }

    @Override
    public void cut() {
        System.out.println("NewYork CHEESE cut");
    }

    @Override
    public void box() {
        System.out.println("NewYork CHEESE box");
    }
}
