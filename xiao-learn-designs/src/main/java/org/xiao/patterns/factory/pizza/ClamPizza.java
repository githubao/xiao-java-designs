package org.xiao.patterns.factory.pizza;

/**
 * 蛤蜊披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:41
 */
public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("CLAM prepare");
    }

    @Override
    public void bake() {
        System.out.println("CLAM bake");
    }

    @Override
    public void cut() {
        System.out.println("CLAM cut");
    }

    @Override
    public void box() {
        System.out.println("CLAM box");
    }
}
