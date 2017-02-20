package org.xiao.patterns.template;

/**
 * 饮料测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:54
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        tea.prepareRecipe();
        coffeeHook.prepareRecipe();
    }

}