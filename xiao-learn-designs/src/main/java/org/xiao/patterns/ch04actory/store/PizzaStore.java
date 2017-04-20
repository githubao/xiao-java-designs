package org.xiao.patterns.ch04actory.store;

import org.xiao.patterns.ch04actory.pizza.Pizza;
import org.xiao.patterns.ch04actory.type.FactoryType;
import org.xiao.patterns.ch04actory.type.PizzaType;

/**
 * 抽象的披萨商店
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 15:50
 */
public abstract class PizzaStore {
    public Pizza orderPizza(FactoryType factory, PizzaType type) {
        Pizza pizza = createPizza(factory, type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public Pizza orderPizza(PizzaType type) {
        return orderPizza(null, type);
    }

    protected abstract Pizza createPizza(FactoryType factory, PizzaType type);
}
