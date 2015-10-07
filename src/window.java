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
    @Override
    public void paintComponent(Graphics g) {
        int width=0;
        int gidth=0;
        super.paintComponent(g);
        for (int k=0;k<50;k++){
            super.paintComponent(g);

            g.fillRect(gidth+k,width+k,gidth+20+k,width+k+20);

        }

        //write either "RED" or "BLUE" using graphics
      // System.out.println("PaintComponent was called!");




    }

    //window method: create an instance of TestPanel and output it on a JFrame
    public static void main(String[] args) throws IOException {
        window w = new window();
        w.repaint();
        JFrame f = new JFrame();

        f.setSize(500, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.add(new window());

        f.setVisible(true);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String line=buffer.readLine();

    }
}
