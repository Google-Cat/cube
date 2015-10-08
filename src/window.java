import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TimerTask;

/**
 * Created by quwantoq on 06.10.15.
 */
public class window extends JPanel {
public window(){
    setFocusable(true);
    requestFocusInWindow();
    addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            myKeyEvt(e, "keyReleased");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            myKeyEvt(e, "keyPressed");
        }

        private void myKeyEvt(KeyEvent e, String text) {
            int key = e.getKeyCode();
            System.out.println("TEST");

            if (key == KeyEvent.VK_KP_LEFT || key == KeyEvent.VK_LEFT)
            {
                moveLeft();;
                System.out.println(text + " LEFT");

            }
            else if (key == KeyEvent.VK_RIGHT)
            {
                System.out.println(text + " RIGHT");
                moveRight();
                //Call some function
            }

        }
    });
}
int x=250;
final int CUBESIZE = 30;
    void moveRight() {
     this.x+=20;
        repaint();
    }
    void moveLeft() {
        this.x-=20;
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x,5,CUBESIZE,CUBESIZE);


    }

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window w = new window();
        f.add(w);
        f.setVisible(true);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hi!");


            }
        });



    }
}

