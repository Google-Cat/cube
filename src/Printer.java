import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Printer extends JPanel {
    static final int CUBESIZE = 20;
    Figure1 f1 = new Figure1(0, 0);
    Figure2 f2 = new Figure2(0, 0);
    Figure3 f3 = new Figure3(0, 0);
    Figure4 f4 = new Figure4(0, 0);
    Figure5 f5 = new Figure5(0, 0);
    Figure6 f6 = new Figure6(0, 0);
    Figure7 f7 = new Figure7(0, 0);
    Window window = new Window();
    Memory memory = new Memory();

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

                if (key == KeyEvent.VK_LEFT) {
                    window.activeShape.moveLeft();
                    repaint();


                } else if (key == KeyEvent.VK_RIGHT) {
                    window.activeShape.moveRight();
                    repaint();

                } else if (key == KeyEvent.VK_DOWN) {
                    window.activeShape.rotateRight();
                    repaint();

                    //Rotation of fiugre


                } else if (key == KeyEvent.VK_UP) {
                    //Forced down move

                }

            }
        });
    }




    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        window.m.printMatrix(g);
        g.setColor(Color.red);
        g.fillRect(window.activeShape.x1, window.activeShape.y1, CUBESIZE, CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(window.activeShape.x2, window.activeShape.y2, CUBESIZE, CUBESIZE);
        g.setColor(Color.blue);
        g.fillRect(window.activeShape.x3, window.activeShape.y3, CUBESIZE, CUBESIZE);
        g.setColor(Color.cyan);
        g.fillRect(window.activeShape.x4, window.activeShape.y4, CUBESIZE, CUBESIZE);

        /*
         g.setColor(Color.black);
        g.fillRect(f1.x1, f1.y1, CUBESIZE, CUBESIZE);
        g.setColor(Color.WHITE);
        g.drawRect(f1.x1, f1.y1, CUBESIZE, CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(f1.x2, f1.y2, CUBESIZE, CUBESIZE);
        g.setColor(Color.WHITE);
        g.drawRect(f1.x2, f1.y2, CUBESIZE, CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(f1.x3, f1.y3, CUBESIZE, CUBESIZE);
        g.setColor(Color.WHITE);
        g.drawRect(f1.x3, f1.y3, CUBESIZE, CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(f1.x4, f1.y4, CUBESIZE, CUBESIZE);
        g.setColor(Color.WHITE);
        g.drawRect(f1.x4, f1.y4, CUBESIZE, CUBESIZE);
         */
        //g.drawString(Boolean.toString(Window.m.matrix[5][5]),20,20);
    }

}

