package org.xiao.patterns.factory.pizza.type;

/**
 * pizza种类枚举类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 14:37
 */
public enum PizzaType {
    CHEESE("cheese"),VEGGIE("veggie"),CLAM("clam"),PEPPERONI("pepperoni");

    PizzaType(String value){
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
