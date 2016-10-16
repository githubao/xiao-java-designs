package org.xiao.patterns.factory.pizza.factory;

import org.apache.commons.lang3.StringUtils;
import org.xiao.patterns.factory.pizza.type.FactoryType;
import org.xiao.patterns.factory.pizza.pizza.Pizza;
import org.xiao.patterns.factory.pizza.type.PizzaType;

/**
 * 负责对象工厂，可以负责创建具体的不同厂商的披萨
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:21
 */
public class ComplexPizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(FactoryType factory, PizzaType type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Pizza pizza = null;

        for (FactoryType factoryType : FactoryType.values()) {
            if (factory.getValue().equals(factoryType.getValue())) {
                for (PizzaType pizzaType : PizzaType.values()) {
                    if (pizzaType.getValue().equals(type.getValue())) {
                        String prefix = getClsName(factory.getValue());
                        String clsName = StringUtils.capitalize(prefix) + StringUtils.capitalize(type.getValue()) + "Pizza";
                        pizza = (Pizza) Class.forName("org.xiao.patterns.factory.pizza.pizza." + clsName).newInstance();
                        break;
                    }
                }
            }
        }
        return pizza;
    }

    private String getClsName(String value) {
        if (StringUtils.isBlank(value)) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        boolean underLine = false;
        for (char c : value.toCharArray()) {
            if ('_'== c) {
                underLine = true;
                continue;
            }

            if (underLine) {
                c = Character.toUpperCase(c);
                underLine = false;
            }

            sb.append(String.valueOf(c));

        }

        return sb.toString();

    }
}
