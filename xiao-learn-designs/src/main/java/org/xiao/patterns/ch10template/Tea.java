package org.xiao.patterns.ch10template;

/**
 * 泡茶
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:46
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("tea brew");
    }

    @Override
    void addCondiments() {
        System.out.println("tea add condiments");
    }
}
