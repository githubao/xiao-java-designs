package org.xiao.patterns.decorator.beverage;

/**
 * 使用对象，实现具体的咖啡
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:43
 */
public class StarBuzzCoffee {
    public StarBuzzCoffee() {
    }

    public void combo() {
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());

    }


}
