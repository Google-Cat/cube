import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by quwantoq on 06.10.15.
 */
public class window extends JPanel {
private Color i;
    public void go(){


    }




    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        setBackground(i);
        //write either "RED" or "BLUE" using graphics
       System.out.println("PaintComponent was called!");
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                i=Color.blue;
                System.out.println("Go!Go!Go!");
                repaint();
            }
        });

        timer.start();



    }

    //window method: create an instance of TestPanel and output it on a JFrame
    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame();

        f.setSize(500, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        f.setVisible(true);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String line=buffer.readLine();

        if (line.equals("q")) {

        }
    }
}
