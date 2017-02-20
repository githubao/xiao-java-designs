package org.xiao.patterns.strategy;

/**
 * 国王
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:02
 */
public class King extends Character{
    public King() {
    }

    public King(WeaponBehavior weapon) {
        super(weapon);
    }
}
