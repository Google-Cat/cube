package ru.quwantoq.tetris;

import java.util.Random;

class Shape {
    static int CUBESIZE = Window.CUBESIZE;
    byte k = 1;


    int x1;
    int x2;
    int x3;
    int x4;
    int y1;
    int y2;
    int y3;
    int y4;
    // Variables to check rotation
    int x1l;
    int x2l;
    int x3l;
    int x4l;
    int y1l;
    int y2l;
    int y3l;
    int y4l;


    Shape() {
    }


    /*
             FIGURE1      FIGURE2     FIGURE3         FIGURE4          FIGURE5      FIGURE6             FIGURE7                     .-
             .......................................................................................................
             ++++                   ++++                ++++
             ++++                   ++++                ++++
             ++++    ++++++++++     ++++                ++++        ++++++++++   ++++++++++            ++++
             ++++    ++++++++++     ++++                ++++        ++++++++++   ++++++++++            ++++
             ++++    ++++++++++     ++++                ++++    ++++++++++           ++++++++++   ++++++++++++++
             ++++    ++++++++++     +++++++++      +++++++++    ++++++++++           ++++++++++   ++++++++++++++
             ++++    ++++++++++     +++++++++      +++++++++                        Красный глючит
             ++++
             ++++
 */
    public Shape shapeFactory() {
        Random rand = new Random();
        int r = rand.nextInt(7);
        switch (r) {
            case 0:
                return new Figure1(0, 0);
            case 1:
                return new Figure2(0, 0);
            case 2:
                return new Figure3(0, 0);
            case 3:
                return new Figure4(0, 0);
            case 4:
                return new Figure5(0, 0);
            case 5:
                return new Figure6(0, 0);
            case 6:
                return new Figure7(0, 0);
        }
        return null;
    }


    void moveRight(Memory memory) {
        if (!isAnyThingRightFigure(memory)) {
            x1 += CUBESIZE;
            x2 += CUBESIZE;
            x3 += CUBESIZE;
            x4 += CUBESIZE;
        }

    }

    void moveLeft(Memory memory) {
        if (!isAnyThingLeftFigure(memory)) {
            x2 -= CUBESIZE;
            x3 -= CUBESIZE;
            x4 -= CUBESIZE;
            x1 -= CUBESIZE;
        }
    }

    void moveDown(Memory memory) {
        if (!isAnyThingUnderFigure(memory)) {
            y1 += CUBESIZE;
            y2 += CUBESIZE;
            y3 += CUBESIZE;
            y4 += CUBESIZE;
        }
    }

    void rotateRight() {
    }

    boolean isAnyThingRightFigure(Memory memory) {
        if (memory.getMatrix()[x1 / CUBESIZE + 2][y1 / CUBESIZE] || memory.getMatrix()[x2 / CUBESIZE + 2][y2 / CUBESIZE] || memory.getMatrix()[x3 / CUBESIZE + 2][y3 / CUBESIZE] || memory.getMatrix()[x4 / CUBESIZE + 2][y4 / CUBESIZE]) {
            return true;
        } else return false;
    }

    boolean isAnyThingLeftFigure(Memory memory) {
        if (memory.getMatrix()[x1 / CUBESIZE][y1 / CUBESIZE] || memory.getMatrix()[x2 / CUBESIZE][y2 / CUBESIZE] || memory.getMatrix()[x3 / CUBESIZE][y3 / CUBESIZE] || memory.getMatrix()[x4 / CUBESIZE][y4 / CUBESIZE]) {
            return true;
        } else return false;

    }

    boolean isAnyThingUnderFigure(Memory memory) {
        if (memory.getMatrix()[x1 / CUBESIZE + 1][y1 / CUBESIZE + 1] || memory.getMatrix()[x2 / CUBESIZE + 1][y2 / CUBESIZE + 1] || memory.getMatrix()[x3 / CUBESIZE + 1][y3 / CUBESIZE + 1] || memory.getMatrix()[x4 / CUBESIZE + 1][y4 / CUBESIZE + 1]) {
            return true;

        } else return false;
    }
}

