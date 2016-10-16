package org.xiao.patterns.util;

/**
 * 常量类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 13:49
 */
public class DesignConstant {
    public static final String CLASS_PATH = DesignConstant.class.getClassLoader().getResource("").getPath();
    public static final String TEST_CLASS_PATH = DesignConstant.class.getClassLoader().getResource("").getPath().replace("test-class","class");
}
