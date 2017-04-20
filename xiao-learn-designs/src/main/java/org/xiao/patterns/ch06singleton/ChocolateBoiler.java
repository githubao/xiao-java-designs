package org.xiao.patterns.ch06singleton;

/**
 * 巧克力加工厂
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 14:56
 */
public abstract class ChocolateBoiler {
    public ChocolateBoiler() {
    }

    private boolean empty;
    private boolean boiled;

    private void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
        print("fill");

//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    //    排出
    private void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
        print("boil");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    //    排出
    private void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
        print("drain");
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    private synchronized void print(String action) {
        System.out.println(String.format("[%s] %s --->:empty:%s, boiled: %s", Thread.currentThread().getName(),action, empty, boiled));
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }

    public void run() {
        fill();
        boil();
        drain();
    }
}
