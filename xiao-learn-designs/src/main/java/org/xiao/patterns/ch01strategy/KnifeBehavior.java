package org.xiao.patterns.ch01strategy;

/**
 * 小刀
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:01
 */
public class KnifeBehavior implements WeaponBehavior{
    public KnifeBehavior() {
    }

    @Override
    public void useWeapon() {
        System.out.println("use knife");
    }
}
