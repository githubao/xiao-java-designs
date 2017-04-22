package org.xiao.patterns.ch11iterator;

import org.junit.Test;

import java.util.Iterator;


/**
 * 食物菜单遍历测试
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:15
 */

public class FoodMenuPrinterTest {

    @Test
    public void print() {
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addItem("rice");
        foodMenu.addItem("chicken");
        foodMenu.addItem("milk");

        Iterator iter = foodMenu.createIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}