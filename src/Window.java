import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by quwantoq on 06.10.15.
 */
public class Window extends JPanel {
    public Window() {
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
                    ;

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
    private final int CUBESIZE = 30;
    private int y = 0;

    void setX(int x) {
        this.x = x;
        repaint();
    }

    void setY(int y) {
        this.y = y;
        repaint();

    }

    void moveDownUntilEnd() {
        if (y < 530) {
            y += 53;
            repaint();
        }
    }

    void moveUp( ) {
        y -= 1;
        repaint();
    }

    void moveDown( ) {
        y += 1;
        repaint();
    }

    void moveRight( ) {
        if (this.x < 553) {
            this.x += 79;
            repaint();
        }
    }

    void moveLeft( ) {
        if (this.x > 0) {
            this.x -= 79;
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
        Вообще тут будет 4 drawRect(), только хызы как передать от объекта, вообще пойдет даже cube.getX1() и тд. будет
        g.drawRect(figure.getX1(), figure.getY1(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX2(), figure.getY2(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX3(), figure.getY3(), CUBESIZE, CUBESIZE);
        g.drawRect(figure.getX4(), figure.getY4(), CUBESIZE, CUBESIZE);
        А теперь только вообще без понятия, paintComponent не схавает методы от фигуры, тк он вообще о ней не знает, а передавать 8 переменный в paintComponent методом я не смогу
        получается дилемма, что делать?
         */
        g.drawString("My coordinates is: X:" + x + " Y:" + y, x - 19, y + CUBESIZE - 15);
    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window w = new Window();
        f.add(w);
        f.setVisible(true);
        System.out.println("Window height: " + f.getInsets() + "Width: ");

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //   w.setY(500-20-31-8);
                /*)
                530 ГЇГ°ГЁ ГўГ»Г±Г®ГІГҐ Г®ГЄГ­Г  Гў 600, Г°Г Г§Г­ГЁГ¶Г  Г­Г  100, Г«ГЁГ­ГҐГ©Г­Г Гї. Г‚Г®ГЇГ°Г®Г±! ГЉГіГ¤Г  ГЇГ°Г®ГҐГЎГ»ГўГ ГѕГІГ±Гї 70 ГЇГЁГЄГ±ГҐГ«ГҐГ©
                553! ГЏГ® ГЁГЄГ±Гі, ГЅГІГ® ГҐГ№Вё Г­ГҐГЇГ®Г­ГїГІГ­ГҐГҐ!
                Г‘ ГЄГ®Г®Г°Г¤ГЁГ­Г ГІГ Г¬ГЁ ГҐГЎГ Г«Г  ГЄГ ГЄГ Гї-ГІГ®
                */
                w.moveDownUntilEnd();
            }
        });
        timer.start();
        Position p = new Position();
        p.setY(1);
        p.setX(2);
        System.out.println(p.toString());


    }
}

