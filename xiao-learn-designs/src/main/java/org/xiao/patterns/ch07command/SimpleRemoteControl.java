package org.xiao.patterns.ch07command;

/**
 * 遥控器
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:21
 */
public class SimpleRemoteControl {
    //    一系列指令的集合
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
    public void undo() {
        command.undo();
    }
}
