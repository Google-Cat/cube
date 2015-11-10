package ru.quwantoq.tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Printer extends JPanel {

    Window window = new Window();


    public Printer() {
        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(new KeyAdapter() {


            @Override
            public void keyPressed(KeyEvent e) {
                myKeyEvt(e, "keyPressed");
            }

            private void myKeyEvt(KeyEvent e, String text) {
                int key = e.getKeyCode();
                //In window writes, that move is unavailable, but here it's still moving
                if (key == KeyEvent.VK_LEFT) {
                    Window.activeShape.moveLeft(Window.memory);
                    repaint();

                } else if (key == KeyEvent.VK_RIGHT) {
                    Window.activeShape.moveRight(Window.memory);
                    repaint();


                } else if (key == KeyEvent.VK_UP) {
                    Window.activeShape.rotateRight();
                    repaint();

                } else if (key == KeyEvent.VK_DOWN) {
                    //Forced down move
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Window.memory.printMatrix(g);
        g.setColor(Color.red);
        g.fillRect(Window.activeShape.x1, Window.activeShape.y1, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(Window.activeShape.x2, Window.activeShape.y2, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.blue);
        g.fillRect(Window.activeShape.x3, Window.activeShape.y3, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.cyan);
        g.fillRect(Window.activeShape.x4, Window.activeShape.y4, Window.CUBESIZE, Window.CUBESIZE);
    }
}

