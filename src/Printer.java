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
                    if (!window.activeShape.isAnyThingLeftFigure(window.memory)) {
                        window.activeShape.moveLeft();
                        repaint();
                    }

                } else if (key == KeyEvent.VK_RIGHT) {
                    if (!window.activeShape.isAnyThingRightFigure(window.memory)) {
                        window.activeShape.moveRight();
                        repaint();
                    }

                } else if (key == KeyEvent.VK_UP) {
                    window.activeShape.rotateRight();
                    repaint();

                    //Rotation of fiugre


                } else if (key == KeyEvent.VK_DOWN) {
                    //Forced down move
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        window.memory.printMatrix(g);
        g.setColor(Color.red);
        g.fillRect(window.activeShape.x1, window.activeShape.y1, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(window.activeShape.x2, window.activeShape.y2, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.blue);
        g.fillRect(window.activeShape.x3, window.activeShape.y3, Window.CUBESIZE, Window.CUBESIZE);
        g.setColor(Color.cyan);
        g.fillRect(window.activeShape.x4, window.activeShape.y4, Window.CUBESIZE, Window.CUBESIZE);
    }

}

