package org.xiao.patterns.ch12composite;

import org.junit.Test;

/**
 * 遍历测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @date: 2017/4/22 13:55
 */

public class MenuTraverTest {

    public static void main(String[] args) {
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