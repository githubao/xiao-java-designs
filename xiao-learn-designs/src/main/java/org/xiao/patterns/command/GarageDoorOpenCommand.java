package org.xiao.patterns.command;

/**
 * 打开垃圾桶的命令
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:30
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public GarageDoorOpenCommand() {
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
