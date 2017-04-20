package org.xiao.patterns.ch0405factory.pizza;

/**
 * 芝加哥风味奶酪披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:19
 */
public class ChicagoCheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Chicago CHEESE prepare");
    }

    @Override
    public void bake() {
        System.out.println("Chicago CHEESE bake");
    }

    @Override
    public void cut() {
        System.out.println("Chicago CHEESE cut");
    }

    @Override
    public void box() {
        System.out.println("Chicago CHEESE box");
    }
}
