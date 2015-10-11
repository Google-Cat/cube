import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Printer extends JPanel {
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
                    moveLeft();


                } else if (key == KeyEvent.VK_RIGHT) {
                    moveRight();

                } else if (key == KeyEvent.VK_DOWN) {
                    //moveDown();
                } else if (key == KeyEvent.VK_UP) {
                    // moveUp();
                }

            }
        });
    }

    private int x = 0;
    public final int CUBESIZE = 30;
    private int y = 0;


    void moveRight() {
        if (this.x < CUBESIZE * 9) {
            this.x += CUBESIZE;
            repaint();
        }
    }

    void moveLeft() {
        if (this.x > 0) {
            this.x -= CUBESIZE;
            repaint();
        }
    }

    void moveDownUntilEnd() {
        if (y < CUBESIZE * 9) {
            this.y += CUBESIZE;
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawRect(x, y, CUBESIZE, CUBESIZE);
        g.drawRect(x, y - CUBESIZE, CUBESIZE, CUBESIZE);
        g.drawRect(x, y - CUBESIZE - CUBESIZE, CUBESIZE, CUBESIZE);
        g.drawRect(x, y - CUBESIZE - CUBESIZE - CUBESIZE, CUBESIZE, CUBESIZE);

        /*
        ������ ��� ����� 4 drawRect(), ������ ���� ��� �������� �� �������, ������ ������ ���� cube.getX1() � ��. �����
        g.drawRect(figure.getX1(), figure.getY1(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX2(), figure.getY2(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX3(), figure.getY3(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX4(), figure.getY4(), CUBESIZE, CUBESIZE);
        � ������ ������ ������ ��� �������, paintComponent �� ������� ������ �� ������, �� �� ������ � ��� �� �����, � ���������� 8 ���������� � paintComponent ������� � �� �����
        ���������� �������, ��� ������?
         */
        g.drawString("My coordinates is: X:" + x + " Y:" + y,x+CUBESIZE,y-CUBESIZE);
    }

}

