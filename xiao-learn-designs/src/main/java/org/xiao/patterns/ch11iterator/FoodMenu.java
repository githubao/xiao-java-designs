package org.xiao.patterns.ch11iterator;

import java.util.Iterator;

/**
 * 食谱菜单
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:04
 */

public class FoodMenu {
    String[] foods = new String[3];
    int len = 0;

    public void addItem(String food) {
        foods[len] = food;
        len += 1;
    }

    public Iterator createIterator(){
        return new FoodMenuIterator(foods);
    }


}
