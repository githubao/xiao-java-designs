package org.xiao.patterns.ch10template;

/**
 * 咖啡
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:46
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("coffee brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee add condiments");
    }
}
