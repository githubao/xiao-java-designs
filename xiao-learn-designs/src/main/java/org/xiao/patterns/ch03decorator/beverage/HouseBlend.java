package org.xiao.patterns.ch03decorator.beverage;

/**
 * 浓缩咖啡
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:29
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "house blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
