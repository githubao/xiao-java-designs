package org.xiao.patterns.factory.factory;

import org.apache.commons.lang3.StringUtils;
import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.type.FactoryType;
import org.xiao.patterns.factory.pizza.Pizza;
import org.xiao.patterns.factory.type.PizzaType;

/**
 * 简单工厂类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:40
 */
public class SimplePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(FactoryType factory, PizzaType type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Pizza pizza = null;

        for (PizzaType pizzaType : PizzaType.values()) {
            if (pizzaType.getValue().equals(type.getValue())) {
                String clsName = StringUtils.capitalize(type.getValue()) + "Pizza";
                pizza = (Pizza) Class.forName("org.xiao.patterns.factory.pizza.pizza." + clsName).newInstance();
                break;
            }
        }

        return pizza;
    }

}
