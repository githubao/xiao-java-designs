package org.xiao.patterns.ch0405factory.pizza;

/**
 * 抽象的披萨类，需要被继承
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:47
 */
public abstract class Pizza {
    public void prepare() {
        System.out.println("DEFAULT prepare");
    }

    public void bake() {
        System.out.println("DEFAULT bake");
    }

    public void cut() {
        System.out.println("DEFAULT cut");
    }

    public void box() {
        System.out.println("DEFAULT box");
    }

}
