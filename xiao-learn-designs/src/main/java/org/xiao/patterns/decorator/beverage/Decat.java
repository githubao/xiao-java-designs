package org.xiao.patterns.decorator.beverage;

/**
 * 低咖啡因
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:36
 */
public class Decat extends Beverage{
    public Decat() {
        description = "decat";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
