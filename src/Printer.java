import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Printer extends JPanel {
 Figure1 f1 = new Figure1(0,0);
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

                    //Rotation of fiugre


                } else if (key == KeyEvent.VK_UP) {
                  //Forced down move
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
        g.drawRect(f1.x1, f1.y1, CUBESIZE, CUBESIZE);
        g.drawRect(f1.x2, f1.y2, CUBESIZE, CUBESIZE);
     g.drawRect(f1.x3, f1.y3, CUBESIZE, CUBESIZE);
   g.drawRect(f1.x4, f1.y4, CUBESIZE, CUBESIZE);


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

