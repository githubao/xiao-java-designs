package org.xiao.patterns.factory.pizza.pizza;

/**
 * 加州风味奶酪披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:19
 */
public class CaliforniaCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("California CHEESE prepare");
    }

    @Override
    public void bake() {
        System.out.println("California CHEESE bake");
    }

    @Override
    public void cut() {
        System.out.println("California CHEESE cut");
    }

    @Override
    public void box() {
        System.out.println("California CHEESE box");
    }
}
