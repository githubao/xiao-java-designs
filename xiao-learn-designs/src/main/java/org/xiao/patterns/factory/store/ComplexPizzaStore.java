package org.xiao.patterns.factory.store;

import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.factory.ComplexPizzaFactory;
import org.xiao.patterns.factory.type.FactoryType;
import org.xiao.patterns.factory.type.PizzaType;

/**
 * 具体的披萨商店
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:31
 */
public class ComplexPizzaStore extends PizzaStore {
    private ComplexPizzaFactory factory = new ComplexPizzaFactory();

    @Override
    protected Pizza createPizza(FactoryType factoryType, PizzaType type) {
        try {
            return factory.createPizza(factoryType, type);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
