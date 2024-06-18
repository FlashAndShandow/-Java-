package org.event_;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    public static void main(String[] args) {
        new BallMove();

    }

    MyPanel myPanel;
    public BallMove(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000, 750);
        //添加监听器
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class MyPanel extends JPanel implements KeyListener {

    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode() + " key pressed");
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y--;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }

        //重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
