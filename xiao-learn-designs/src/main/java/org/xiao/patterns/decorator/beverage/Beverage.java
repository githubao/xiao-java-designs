package org.xiao.patterns.decorator.beverage;

/**
 * 饮料抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/14 22:05
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    int size;
    static int LARGE;
    static int MIDDLE;
    static int SMALL;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
