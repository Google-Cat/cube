import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by quwantoq on 06.10.15.
 */
public class Window {
    public static void main(String[] args) {

        JFrame f = new JFrame();


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Printer p = new Printer();
        f.add(p);
        f.setVisible(true);


        f.getContentPane().setPreferredSize(new Dimension(p.CUBESIZE * 10, p.CUBESIZE * 10));
        f.pack();
        System.out.println(f.getContentPane().getSize());
        System.out.println("Window height: " + f.getInsets() + "Width: ");

        //System.out.println(sh.toString());

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //p.moveDownUntilEnd();
            }
        });
        timer.start();


    }
}

