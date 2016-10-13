package org.xiao.patterns.observer;

import org.junit.Test;

/**
 * swing 测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 21:13
 */
public class SwingObserverTest {
    @Test
    public void test(){
        SwingObserver swingObserver = new SwingObserver();
        swingObserver.run();
    }
}
