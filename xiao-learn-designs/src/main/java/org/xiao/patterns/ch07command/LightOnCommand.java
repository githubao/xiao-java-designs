package org.xiao.patterns.ch07command;

/**
 * 打开电灯命令
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:18
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public LightOnCommand() {
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
