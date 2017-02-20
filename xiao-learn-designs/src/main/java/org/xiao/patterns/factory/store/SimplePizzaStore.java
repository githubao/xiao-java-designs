package org.xiao.patterns.factory.store;

import org.xiao.patterns.factory.factory.SimplePizzaFactory;
import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.type.FactoryType;
import org.xiao.patterns.factory.type.PizzaType;

/**
 * 默认的披萨商店
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:40
 */
public class SimplePizzaStore extends PizzaStore {
    SimplePizzaFactory factory = new SimplePizzaFactory();

    public SimplePizzaStore() {
    }

    @Override
    protected Pizza createPizza(FactoryType factoryType, PizzaType type) {
        try {
            return factory.createPizza(null, type);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
