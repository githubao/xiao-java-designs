package org.xiao.patterns.factory.pizza;

import org.junit.Test;
import org.xiao.patterns.factory.pizza.store.SimplePizzaStore;
import org.xiao.patterns.factory.pizza.type.PizzaType;

/**
 * 简单披萨商店测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 15:09
 */
public class SimplePizzaStoreTest {
    @Test
    public void test() {
        SimplePizzaStore store = new SimplePizzaStore();

        for (PizzaType type : PizzaType.values()) {
            store.orderPizza(type);
            System.out.println("******");
        }

    }
}
