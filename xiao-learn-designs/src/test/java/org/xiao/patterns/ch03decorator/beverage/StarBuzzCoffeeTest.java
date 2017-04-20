package org.xiao.patterns.ch03decorator.beverage;

import org.junit.Test;

/**
 * 星巴克咖啡测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:48
 */
public class StarBuzzCoffeeTest {
    @Test
    public void test() {
        StarBuzzCoffee coffee = new StarBuzzCoffee();
        coffee.combo();
    }

}
