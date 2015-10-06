import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by quwantoq on 06.10.15.
 */
public class main extends JPanel {



    public main(Color i) {
    setBackground(i);
        repaint();
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //write either "RED" or "BLUE" using graphics
       System.out.println("PaintComponent was called!");



    }

    //main method: create an instance of TestPanel and output it on a JFrame
    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame();

        f.setSize(500, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setContentPane(new main(Color.red));

        f.setVisible(true);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String line=buffer.readLine();

        if (line.equals("q")) {

            f.setContentPane(new main(Color.blue));

        }
    }
}
