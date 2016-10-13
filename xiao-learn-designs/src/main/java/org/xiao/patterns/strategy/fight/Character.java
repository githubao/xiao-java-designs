package org.xiao.patterns.strategy.fight;

/**
 * 角色抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 20:59
 */
public abstract class Character {
    public Character() {
    }

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    private WeaponBehavior weapon;

    protected void fight(){
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
