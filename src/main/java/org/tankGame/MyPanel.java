package org.tankGame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private MyTank myTank = null;

    public MyPanel() {
        myTank = new MyTank(100, 100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
//        g.fill3DRect(myTank.getX(), myTank.getY(), 30, 30, false);
    }
}
