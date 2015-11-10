package ru.quwantoq.tetris;

import javax.swing.*;
import java.awt.*;


public class Window {
    static final int WIDTH = 10;
    static final int HEIGHT = 15;
    static final int CUBESIZE = 20;
    static Memory memory = new Memory();
    static ru.quwantoq.tetris.Shape activeShape = new ru.quwantoq.tetris.Shape();
    static JFrame frame = new JFrame();
    static Printer printer = new Printer();

    public static void main(String[] args) {
        activeShape = activeShape.shapeFactory();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(printer);
        frame.setVisible(true);
        frame.getContentPane().setPreferredSize(new Dimension(CUBESIZE * WIDTH, CUBESIZE * HEIGHT));
        frame.pack();
        Timer timer = new Timer(600, actionEvent -> {
            activeShape.moveDown(memory);
            if (activeShape.isAnyThingUnderFigure(memory)) {
                memory.absorbFigure(activeShape);
                memory.cleanRow();
                activeShape = activeShape.shapeFactory();
            }
            printer.repaint();


        });
        timer.start();
    }
}


