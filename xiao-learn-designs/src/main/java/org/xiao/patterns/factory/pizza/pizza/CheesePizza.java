package org.xiao.patterns.factory.pizza.pizza;

/**
 * 奶酪披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:40
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CHEESE prepare");
    }

    @Override
    public void bake() {
        System.out.println("CHEESE bake");
    }

    @Override
    public void cut() {
        System.out.println("CHEESE cut");
    }

    @Override
    public void box() {
        System.out.println("CHEESE box");
    }
}
