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
        public void keyPressed(KeyEvent e) {
            myKeyEvt(e, "keyPressed");
        }

        private void myKeyEvt(KeyEvent e, String text) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT)
            {
                moveLeft();;

            }

            else if (key == KeyEvent.VK_RIGHT)
            {
                moveRight();

            }

        }
    });
}
private int x=250;
private final int CUBESIZE = 30;
private int  y = 0;

    void moveDown( ){
        y+=20;
        repaint();
    }

    void moveRight( ) {
     this.x+=20;
        repaint();
    }

    void moveLeft( ) {
        this.x-=20;
       repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x,y,CUBESIZE,CUBESIZE);
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
               w.moveDown();


            }
        });
        timer.start();



    }
}

