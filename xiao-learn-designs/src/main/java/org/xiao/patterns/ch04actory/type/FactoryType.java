package org.xiao.patterns.ch04actory.type;

/**
 * 具体类型的工厂类型
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 16:11
 */
public enum FactoryType {
    NEWYORK("new_york"), CHICAGO("chicago"), CALIFORNIA("california");

    FactoryType(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
