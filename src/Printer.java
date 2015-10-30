import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Printer extends JPanel {
    Figure1 f11 = new Figure1(0, 0);
    Figure2 f33 = new Figure2(0, 0);
    Figure3 f12244 = new Figure3(0, 0);
    Figure4 f122 = new Figure4(0, 0);
    Figure5 f134 = new Figure5(0, 0);
    Figure6 f12 = new Figure6(0, 0);
    Figure7 f1 = new Figure7(0, 0);
    Window w = new Window();

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
                    f1.moveLeft();
                    repaint();


                } else if (key == KeyEvent.VK_RIGHT) {
                    f1.moveRight();
                    repaint();

                } else if (key == KeyEvent.VK_DOWN) {
                    f1.rotateRight();
                    repaint();

                    //Rotation of fiugre


                } else if (key == KeyEvent.VK_UP) {
                    //Forced down move

                }

            }
        });
    }

    private int x = 0;
    private int y = 0;
    static public final int CUBESIZE = 20;


    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(f1.x1, f1.y1, CUBESIZE, CUBESIZE);
        g.setColor(Color.black);
        g.fillRect(f1.x2, f1.y2, CUBESIZE, CUBESIZE);
        g.setColor(Color.blue);
        g.fillRect(f1.x3, f1.y3, CUBESIZE, CUBESIZE);
        g.setColor(Color.cyan);
        g.fillRect(f1.x4, f1.y4, CUBESIZE, CUBESIZE);

        //��� ��� ��������� �� ���� memory � ������


        //g.drawString("My coordinates is: X:" + x + " Y:" + y, x + CUBESIZE, y - CUBESIZE);
    }

}

