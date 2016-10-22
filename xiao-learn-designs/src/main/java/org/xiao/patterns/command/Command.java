package org.xiao.patterns.command;

/**
 * 命令的抽象类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:17
 */
public interface Command {
    void execute();
    void undo();
}
