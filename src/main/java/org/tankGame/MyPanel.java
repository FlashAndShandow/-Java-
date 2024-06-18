package org.tankGame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private MyTank myTank ;

    public MyPanel() {
        myTank = new MyTank(100, 100);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
//        g.fill3DRect(myTank.getX(), myTank.getY(), 30, 30, false);

        //画出坦克
        drawTank(myTank.getX(), myTank.getY(), g, 0, 0);
    }

    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0:
                g.setColor(Color.cyan);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
        }
        //0表示向上，1表示向右，2表示向下，3表示向左
        switch (type) {
            case 0:
                //画出我的坦克，向上
                //画出左边的矩形
                g.fill3DRect(x, y, 5, 30, false);
                //画出右边的矩形
                g.fill3DRect(x + 15, y, 5, 30, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //画出中间的圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //画出线
                g.drawLine(x + 10, y + 15, x + 10, y);
                break;
            case 1:
                //画出我的坦克，向右
                //画出上边的矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下边的矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出中间的圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出线
                g.drawLine(x + 15, y + 10, x + 30, y + 10);
                break;
            case 2:
                //画出我的坦克，向下
                //画出左边的矩形
                g.fill3DRect(x, y, 5, 30, false);
                //画出右边的矩形
                g.fill3DRect(x + 15, y, 5, 30, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 10, 20, false);
                //画出中间的圆形
                g.fillOval(x + 5, y + 10, 10, 10);
                //画出线
                g.drawLine(x + 10, y + 15, x + 10, y + 30);
                break;
            case 3:
                //画出我的坦克，向左
                //画出上边的矩形
                g.fill3DRect(x, y, 30, 5, false);
                //画出下边的矩形
                g.fill3DRect(x, y + 15, 30, 5, false);
                //画出中间矩形
                g.fill3DRect(x + 5, y + 5, 20, 10, false);
                //画出中间的圆形
                g.fillOval(x + 10, y + 5, 10, 10);
                //画出线
                g.drawLine(x + 15, y + 10, x, y + 10);
                break;


        }
    }
}
