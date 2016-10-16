package org.xiao.patterns.factory.pizza.pizza;

/**
 * 素食披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:41
 */
public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("VEGGIE prepare");
    }

    @Override
    public void bake() {
        System.out.println("VEGGIE bake");
    }

    @Override
    public void cut() {
        System.out.println("VEGGIE cut");
    }

    @Override
    public void box() {
        System.out.println("VEGGIE box");
    }
}
