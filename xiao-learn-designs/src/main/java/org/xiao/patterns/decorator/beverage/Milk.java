package org.xiao.patterns.decorator.beverage;

/**
 * 牛奶配料
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:39
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public Milk() {
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
