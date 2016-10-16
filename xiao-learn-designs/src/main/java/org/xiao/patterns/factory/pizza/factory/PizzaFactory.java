package org.xiao.patterns.factory.pizza.factory;

import org.xiao.patterns.factory.pizza.type.FactoryType;
import org.xiao.patterns.factory.pizza.pizza.Pizza;
import org.xiao.patterns.factory.pizza.type.PizzaType;

/**
 * 披萨抽象工厂类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 15:44
 */
public abstract class PizzaFactory {
    public abstract Pizza createPizza(FactoryType factory, PizzaType type) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
