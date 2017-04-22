package org.xiao.patterns.ch12composite;

/**
 * 单项菜单
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:42
 */

public class MenuItem extends MenuComponent {
    String data;

    public MenuItem(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("item: " + data);
    }

}
