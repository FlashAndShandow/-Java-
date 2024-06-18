package org.tankGame;

import javax.swing.*;

public class TankGame extends JFrame {

    MyPanel myPanel = null;
    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame() {
        myPanel = new MyPanel();
        this.add(myPanel);//将面板添加到窗口
        this.setSize(1000, 750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
