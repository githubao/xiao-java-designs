package org.xiao.patterns.decorator.beverage;

/**
 * 奶泡配料
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:38
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public Whip() {
    }

    @Override
    public double cost() {
        return 0.10+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Whip";
    }
}
