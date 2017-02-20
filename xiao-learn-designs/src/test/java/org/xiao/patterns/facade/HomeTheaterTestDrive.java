package org.xiao.patterns.facade;

/**
 * 家庭影院测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:27
 */
public class HomeTheaterTestDrive {
    Light light = new Light();
    TV tv = new TV();

    private void test() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(light, tv);

        homeTheater.watchTv();
        homeTheater.sleep();
    }

    public static void main(String[] args) {
        new HomeTheaterTestDrive().test();
    }

}