package org.xiao.patterns.decorator.beverage;

/**
 * 摩卡配料
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:37
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public Mocha() {
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
