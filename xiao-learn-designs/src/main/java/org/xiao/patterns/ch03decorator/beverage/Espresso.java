package org.xiao.patterns.ch03decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:28
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
