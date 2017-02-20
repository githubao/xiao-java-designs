package org.xiao.patterns.strategy;

import org.junit.Test;

/**
 * 角色测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:06
 */
public class CharacterTest {
    @Test
    public void test() {
        SwordBehavior sword = new SwordBehavior();
        AxeBehavior axe = new AxeBehavior();
        KnifeBehavior knife = new KnifeBehavior();

        King king = new King(sword);
        Queen queen = new Queen(axe);
        Knight knight = new Knight(knife);

        king.fight();
        queen.fight();
        knight.fight();

        king.setWeapon(axe);
        king.fight();

        queen.setWeapon(knife);
        queen.fight();

        System.out.println("end");


    }

}
