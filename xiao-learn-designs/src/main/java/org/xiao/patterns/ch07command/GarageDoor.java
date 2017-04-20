package org.xiao.patterns.ch07command;

/**
 * 垃圾桶
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:29
 */
public class GarageDoor {
    public GarageDoor() {
    }

    public void open(){
        System.out.println("Garage Door Opened");
    }

    public void close() {
        System.out.println("Garage Door Closed");
    }
}
