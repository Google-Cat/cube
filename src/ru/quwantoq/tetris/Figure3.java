package ru.quwantoq.tetris;

/**
 * Created by quwantoq on 19.10.15.
 */
public class Figure3 extends Shape {


    public Figure3(int x, int y) {
        x1 = x;
        x2 = x;
        x3 = x;
        x4 = x + CUBESIZE;
        y1 = y;
        y2 = y + CUBESIZE;
        y3 = y + 2 * CUBESIZE;
        y4 = y + 2 * CUBESIZE;
    }

    @Override
    void rotateRight() {
        switch (k % 4) {
            //Cюда можно попасть из case 3
            case 0:
                System.out.print((k % 4) + "\n");
                x1l = x1 + CUBESIZE;
                x2l = x2;
                x3l = x3 - CUBESIZE;
                x4l = x4;
                y1l = y1 - CUBESIZE;
                y2l = y2;
                y3l = y3 + CUBESIZE;
                y4l = y4 + 2 * CUBESIZE;
                if (!Window.memory.getMatrix()[x1l / CUBESIZE + 1][y1l / CUBESIZE] && !Window.memory.getMatrix()[x2l / CUBESIZE + 1][y2l / CUBESIZE] && !Window.memory.getMatrix()[x3l / CUBESIZE + 1][y3l / CUBESIZE] && !Window.memory.getMatrix()[x4l / CUBESIZE + 1][y4l / CUBESIZE]) {

                    x1 = x1l;
                    x2 = x2l;
                    x3 = x3l;
                    x4 = x4l;
                    y1 = y1l;
                    y2 = y2l;
                    y3 = y3l;
                    y4 = y4l;
                    k++;
                }


                break;

            case 1:
                System.out.print((k % 4) + "\n");
                x1l = x1 + CUBESIZE;
                x2l = x2;
                x3l = x3 - CUBESIZE;
                x4l = x4 - 2 * CUBESIZE;
                y1l = y1 + CUBESIZE;
                y2l = y2;
                y3l = y3 - CUBESIZE;
                y4l = y4;
                if (!Window.memory.getMatrix()[x1l / CUBESIZE + 1][y1l / CUBESIZE] && !Window.memory.getMatrix()[x2l / CUBESIZE + 1][y2l / CUBESIZE] && !Window.memory.getMatrix()[x3l / CUBESIZE + 1][y3l / CUBESIZE] && !Window.memory.getMatrix()[x4l / CUBESIZE + 1][y4l / CUBESIZE]) {
                    x1 = x1l;
                    x2 = x2l;
                    x3 = x3l;
                    x4 = x4l;
                    y1 = y1l;
                    y2 = y2l;
                    y3 = y3l;
                    y4 = y4l;
                    k++;
                }


                break;
            case 2:

                System.out.print((k % 4) + "\n");
                x1l = x1 - CUBESIZE;
                x2l = x2;
                x3l = x3 + CUBESIZE;
                x4l = x4;
                y1l = y1 + CUBESIZE;
                y2l = y2;
                y3l = y3 - CUBESIZE;
                y4l = y4 - 2 * CUBESIZE;
                if (!Window.memory.getMatrix()[x1l / CUBESIZE + 1][y1l / CUBESIZE] && !Window.memory.getMatrix()[x2l / CUBESIZE + 1][y2l / CUBESIZE] && !Window.memory.getMatrix()[x3l / CUBESIZE + 1][y3l / CUBESIZE] && !Window.memory.getMatrix()[x4l / CUBESIZE + 1][y4l / CUBESIZE]) {
                    x1 = x1l;
                    x2 = x2l;
                    x3 = x3l;
                    x4 = x4l;
                    y1 = y1l;
                    y2 = y2l;
                    y3 = y3l;
                    y4 = y4l;
                    k++;
                }


                break;
            case 3:
                //Here's next point to do!
                System.out.print((k % 4) + "\n");
                x1l = x1 - CUBESIZE;
                x2l = x2;
                x3l = x3 + CUBESIZE;
                x4l = x4 + 2 * CUBESIZE;
                y1l = y1 - CUBESIZE;
                y2l = y2;
                y3l = y3 + CUBESIZE;
                y4l = y4;
                if (!Window.memory.getMatrix()[x1l / CUBESIZE + 1][y1l / CUBESIZE] && !Window.memory.getMatrix()[x2l / CUBESIZE + 1][y2l / CUBESIZE] && !Window.memory.getMatrix()[x3l / CUBESIZE + 1][y3l / CUBESIZE] && !Window.memory.getMatrix()[x4l / CUBESIZE + 1][y4l / CUBESIZE]) {
                    x1 = x1l;
                    x2 = x2l;
                    x3 = x3l;
                    x4 = x4l;
                    y1 = y1l;
                    y2 = y2l;
                    y3 = y3l;
                    y4 = y4l;
                    k++;

                    break;
                }
        }
    }
}

