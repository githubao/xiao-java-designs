package org.xiao.patterns.ch11iterator;

import java.util.Iterator;

/**
 * 迭代器
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:07
 */

public class FoodMenuIterator implements Iterator {
    String[] foods;
    int pos = 0;

    public FoodMenuIterator(String[] foods) {
        this.foods = foods;
    }

    @Override
    public boolean hasNext() {
        return pos < foods.length;
    }

    @Override
    public Object next() {
        String current = foods[pos];
        pos += 1;
        return current;
    }
}
