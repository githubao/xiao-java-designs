package org.xiao.patterns.decorator.beverage;

/**
 * 豆浆配料
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:38
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Soy() {
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (getSize() == Beverage.LARGE) {
            cost += 0.20;
        } else if (getSize() == Beverage.MIDDLE) {
            cost += 0.15;
        } else if (getSize() == Beverage.SMALL) {
            cost += 0.10;
        }

        return cost;
//        return 0.15+beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
