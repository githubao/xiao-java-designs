package org.xiao.patterns.adapter;

/**
 * 火鸡适配器
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 19:39
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 3; i++) {
            turkey.fly();
        }
    }
}
