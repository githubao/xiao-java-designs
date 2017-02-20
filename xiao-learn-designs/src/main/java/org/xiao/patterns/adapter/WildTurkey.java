package org.xiao.patterns.adapter;

/**
 * 野鸡
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 19:38
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("wild turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("wild turkey fly");
    }
}
