package org.xiao.patterns.factory.pizza;

/**
 * 香肠披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:41
 */
public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("PEPPERONI prepare");
    }

    @Override
    public void bake() {
        System.out.println("PEPPERONI bake");
    }

    @Override
    public void cut() {
        System.out.println("PEPPERONI cut");
    }

    @Override
    public void box() {
        System.out.println("PEPPERONI box");
    }
}
