package ru.quwantoq.tetris;

public class Figure1 extends Shape {


    //Положение ротейшена вначале 0 (|)
    //Сделать вращение вокруг среднего квадрата
    public Figure1(int x, int y) {
        x1 = x;
        x2 = x;
        x3 = x;
        x4 = x;
        y1 = y;
        y2 = y + CUBESIZE;
        y3 = y + CUBESIZE * 2;
        y4 = y + CUBESIZE * 3;
    }

    @Override
    void rotateRight() {
        //4 позиции (0,1,2,3)

        switch (k % 4) {
            //Cюда можно попасть из case 3
            case 0:

                System.out.print((k % 4) + "\n");
                x1l = x1  -  CUBESIZE;
                x2l = x2;
                x3l = x3 + CUBESIZE;
                x4l = x4 + 2 * CUBESIZE;
                y1l = y1 - CUBESIZE;
                y2l = y2;
                y3l = y3 + CUBESIZE;
                y4l = y4 + 2 * CUBESIZE;

                //  if ((x1l < CUBESIZE * 9) && (x2l < CUBESIZE * 9) && (x3l < CUBESIZE * 9) && (x4l < CUBESIZE * 9) && (x1l > 0) && (x2l > 0) && (x3l > 0) && (x4l > 0) && (y1l < CUBESIZE * 9) && (y2l < CUBESIZE * 9) && (y3l < CUBESIZE * 9) && (y4l < CUBESIZE * 9)) {
                if (!Window.memory.getMatrix()[x1l / CUBESIZE][y1l / CUBESIZE] && !Window.memory.getMatrix()[x2l / CUBESIZE][y2l / CUBESIZE] && !Window.memory.getMatrix()[x3l / CUBESIZE][y3l / CUBESIZE] && !Window.memory.getMatrix()[x4l / CUBESIZE][y4l / CUBESIZE]) {
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

                x1l = x1 - CUBESIZE;
                x2l = x2;
                x3l = x3 + CUBESIZE;
                x4l = x4 + 2 * CUBESIZE;
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
            case 2:

                System.out.print((k % 4) + "\n");
                /*
                x1l = x1 + CUBESIZE;
                x2l = x2;
                x3l = x3 - CUBESIZE;
                x4l = x4 - 2 * CUBESIZE;
                y1l = y1 + CUBESIZE;
                y2l = y2;
                y3l = y3 - CUBESIZE;
                y4l = y4 - 2 * CUBESIZE;
                */
                x1l = x1 + CUBESIZE;
                x2l = x2;
                x3l = x3 - CUBESIZE;
                x4l = x4 - 2 * CUBESIZE;
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
                    //тут баг (вращение фигуры)
                }
                break;
            case 3:
                System.out.print((k % 4) + "\n");
                x1l = x1 + CUBESIZE;
                x2l = x2;
                x3l = x3 - CUBESIZE;
                x4l = x4 - 2 * CUBESIZE;
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
        }
    }
}