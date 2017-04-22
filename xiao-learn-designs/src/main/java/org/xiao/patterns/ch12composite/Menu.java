package org.xiao.patterns.ch12composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单项的集合
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:41
 */

public class Menu extends MenuComponent {
    String name;
    List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent item) {
        components.add(item);
    }

    public void print() {
        System.out.println("Menu: " + name);

        for (MenuComponent item : components) {
            item.print();
        }
    }

}
