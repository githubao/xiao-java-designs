package org.xiao.patterns.factory.pizza;

import org.junit.Test;
import org.xiao.patterns.factory.pizza.store.ComplexPizzaStore;
import org.xiao.patterns.factory.pizza.type.FactoryType;
import org.xiao.patterns.factory.pizza.type.PizzaType;

/**
 * 具体披萨商店测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:47
 */
public class ComplexPizzaStoreTest {
    @Test
    public void test() {
        ComplexPizzaStore store = new ComplexPizzaStore();

        for (PizzaType type : PizzaType.values()) {
            for (FactoryType factory : FactoryType.values()) {
                store.orderPizza(factory, type);
                System.out.println("******");
            }
//            由于其他口味的，还没有实现
            break;

        }

    }
}
