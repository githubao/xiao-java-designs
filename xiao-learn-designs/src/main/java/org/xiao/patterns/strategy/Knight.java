package org.xiao.patterns.strategy;

/**
 * 骑士
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:02
 */
public class Knight extends Character {
    public Knight() {
    }

    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }
}
