
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by quwantoq on 06.10.15
 */
public class Window {
    static final int WIDTH = 10;
    static final int HEIGTH = 15;
    static final int CUBESIZE = 20;
    static Memory memory = new Memory();
    static Shape activeShape = new Shape();


    public static void main(String[] args) {
        activeShape = activeShape.shapeFactory();
        Printer printer = new Printer();
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(printer);
        f.setVisible(true);
        f.getContentPane().setPreferredSize(new Dimension(CUBESIZE * WIDTH, CUBESIZE * HEIGTH));
        f.pack();
        Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                activeShape.moveDown();
                if (activeShape.isAnyThingUnderFigure(memory)) {
                    activeShape.sendToMemory(memory);
                    activeShape = activeShape.shapeFactory();
                    memory.cleanRow();
                    //  System.out.println(Arrays.deepToString(m.getMatrix()));

                }
                printer.repaint();


            }
        });
        timer.start();
    }
}


