package org.xiao.patterns.decorator.beverage;

/**
 * 深焙咖啡
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:35
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "dark roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
