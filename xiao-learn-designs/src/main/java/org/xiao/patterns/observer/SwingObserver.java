package org.xiao.patterns.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * swing 观察者模式 例子
 *
 * @author BaoQiang
 * @version 2.0
 * @Create at 2016/10/13 20:49
 */
public class SwingObserver {
    JFrame frame;

    public SwingObserver() {
    }

    public void run() {
        frame = new JFrame();

        JButton button = new JButton("Should i do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("i am angel");
        }
    }

    class DevilListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("i am devil");
        }
    }

}
