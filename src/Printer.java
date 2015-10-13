import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Printer extends JPanel {
    Shape sh = new Shape(Shape.ShapeType.FIGURE1,0,0);
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
                    sh.moveLeft();
                    repaint();


                } else if (key == KeyEvent.VK_RIGHT) {
                    sh.moveRight();
                    repaint();

                } else if (key == KeyEvent.VK_DOWN) {
                    //moveDown();
                } else if (key == KeyEvent.VK_UP) {
                    // moveUp();
                }

            }
        });
    }

    private int x = 0;
    static public final int CUBESIZE = 30;
    private int y = 0;




    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.drawRect(sh.x1, sh.y1, CUBESIZE, CUBESIZE);
        g.drawRect(sh.x2, sh.y2, CUBESIZE, CUBESIZE);
        g.drawRect(sh.x3, sh.y3, CUBESIZE, CUBESIZE);
        g.drawRect(sh.x4, sh.y4, CUBESIZE, CUBESIZE);

        /*
        Вообще тут будет 4 drawRect(), только хызы как передать от объекта, вообще пойдет даже cube.getX1() и тд. будет
        g.drawRect(figure.getX1(), figure.getY1(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX2(), figure.getY2(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX3(), figure.getY3(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX4(), figure.getY4(), CUBESIZE, CUBESIZE);
        А теперь только вообще без понятия, paintComponent не схавает методы от фигуры, тк он вообще о ней не знает, а передавать 8 переменный в paintComponent методом я не смогу
        получается дилемма, что делать?
         */
        g.drawString("My coordinates is: X:" + x + " Y:" + y,x+CUBESIZE,y-CUBESIZE);
    }

}

