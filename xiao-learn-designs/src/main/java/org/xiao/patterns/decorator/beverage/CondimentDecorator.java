package org.xiao.patterns.decorator.beverage;

/**
 * 原料抽象类，需要具体的原料继承
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:27
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();

}
