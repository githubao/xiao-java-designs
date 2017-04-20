package org.xiao.patterns.ch06singleton;

/**
 * 线程安全的巧克力加工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 14:50
 */
public class ChocolateBoilerSafe extends ChocolateBoiler {
    private ChocolateBoilerSafe() {
    }

//    饿汉
//    private static ChocolateBoilerSafe ch06singleton = new ChocolateBoilerSafe();

    //    懒汉
    private volatile static ChocolateBoilerSafe singleton;

    public static ChocolateBoilerSafe getInstance() {
        if (null == singleton) {
            synchronized (ChocolateBoilerSafe.class) {
                if (null == singleton) {
                    singleton = new ChocolateBoilerSafe();
                }
            }
        }

        return singleton;
    }


    //    每次都同步的方式
//    public static synchronized ChocolateBoilerSafe getInstance() {
//        if (null == ch06singleton) {
//            ch06singleton = new ChocolateBoilerSafe();
//        }
//
//        return ch06singleton;
//    }
}
