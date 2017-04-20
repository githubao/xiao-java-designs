package org.xiao.patterns.ch03decorator.io;

import org.junit.Test;
import org.xiao.patterns.util.DesignConstant;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件流小写转换测试
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 13:11
 */
public class LowercaseInputStreamTest {
    private static final String FILE = DesignConstant.TEST_CLASS_PATH + "org/xiao/patterns/file.txt";

    @Test
    public void test() {
        int c;
        InputStream in = null;
        try {
            in = new LowercaseInputStream(new BufferedInputStream(new FileInputStream(FILE)));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
