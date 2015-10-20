import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by quwantoq on 06.10.15.
 */
public class Window {
    public static void main(String[] args) {
        Printer p = new Printer();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.setVisible(true);
        f.getContentPane().setPreferredSize(new Dimension(p.CUBESIZE * 10, p.CUBESIZE * 10));
        f.pack();


        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.f1.moveDown();

                p.repaint();
                /*
               if (p.f1.getDown() ){
                   p.f1.saveToMemomery()
                   }
                   */

            }
        });
        timer.start();
        /*
        p.f1.moveDown();
        p.f1.moveDown();
        p.f1.moveDown();
    */
    }
}

