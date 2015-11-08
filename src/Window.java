
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Window {
    static final int WIDTH = 10;
    static final int HEIGTH = 15;
    static final int CUBESIZE = 20;
    static Memory memory = new Memory();
    static Shape activeShape = new Shape();
    static JFrame frame = new JFrame();

    public static void main(String[] args) {
        activeShape = activeShape.shapeFactory();
        Printer printer = new Printer();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(printer);
        frame.setVisible(true);
        frame.getContentPane().setPreferredSize(new Dimension(CUBESIZE * WIDTH, CUBESIZE * HEIGTH));
        frame.pack();
        Timer timer = new Timer(900, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                activeShape.moveDown(memory);
                if (activeShape.isAnyThingUnderFigure(memory)) {
                    activeShape.sendToMemory(memory);
                    activeShape = activeShape.shapeFactory();
                    memory.cleanRow();
                }

                printer.repaint();


            }
        });
        timer.start();
    }
}


