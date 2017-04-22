package org.xiao.patterns.ch12composite;

/**
 * 变量对象的实现
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:50
 */

public class MenuTraver {

    public void travel() {
        MenuComponent root = new Menu("root");

        root.add(new MenuItem("file1-1"));
        root.add(new MenuItem("file1-2"));

        MenuComponent folder = new Menu("folder1-1");
        folder.add(new MenuItem("file2-1"));
        folder.add(new MenuItem("file2-2"));

        root.add(folder);

        root.print();

    }

}
