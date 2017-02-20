package org.xiao.patterns.facade;

/**
 * 家庭影院
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:24
 */
public class HomeTheaterFacade {
    Light light;
    TV tv;

    public HomeTheaterFacade(Light light, TV tv) {
        this.light = light;
        this.tv = tv;
    }

    public void watchTv(){
        light.on();
        tv.start();
    }

    public void sleep(){
        tv.end();
        light.off();
    }

}
