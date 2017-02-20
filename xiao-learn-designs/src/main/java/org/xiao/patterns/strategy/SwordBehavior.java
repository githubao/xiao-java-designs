package org.xiao.patterns.strategy;

/**
 * 弓箭
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:00
 */
public class SwordBehavior implements WeaponBehavior{
    public SwordBehavior() {
    }

    @Override
    public void useWeapon() {
        System.out.println("use sword");
    }
}
