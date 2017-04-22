package org.xiao.patterns.ch11iterator;

import java.util.Iterator;

/**
 * 打印器
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:12
 */

public class FoodMenuPrinter {

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
