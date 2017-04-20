package org.xiao.patterns.ch03decorator.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 把读入的文件流转换成小写的装饰类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/16 12:59
 */
public class LowercaseInputStream extends FilterInputStream {
    public LowercaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
