package org.xiao.patterns.ch10template;

/**
 * 咖啡因饮料
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:43
 */
public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourIntoCup();
        if (customWantsCondiments()) {
            addCondiments();
        }
    }

    void boilWater() {
        System.out.println("boil water");
    }

    void pourIntoCup() {
        System.out.println("pour into cup");
    }

    abstract void brew();

    abstract void addCondiments();

    boolean customWantsCondiments() {
        return true;
    }

}
