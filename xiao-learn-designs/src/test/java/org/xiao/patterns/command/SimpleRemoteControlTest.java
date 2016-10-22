package org.xiao.patterns.command;

import org.junit.Test;

/**
 * 遥控器测试类
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/22 16:26
 */
public class SimpleRemoteControlTest {

    @Test
    public void test(){
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        control.setCommand(lightOn);
        control.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        control.setCommand(garageDoorOpen);
        control.buttonWasPressed();

        control.undo();
    }

}