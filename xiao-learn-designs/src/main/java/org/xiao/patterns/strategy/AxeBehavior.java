package org.xiao.patterns.strategy;

/**
 * 斧头
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:01
 */
public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("use axe");
    }
}
