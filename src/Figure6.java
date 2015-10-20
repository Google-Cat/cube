/**
 * Created by quwantoq on 20.10.15.
 */
public class Figure6 extends Shape {
    public Figure6(int x, int y) {
        x1 = x;
        x2 = x + CUBESIZE;
        x3 = x + CUBESIZE;
        x4 = x + 2 * CUBESIZE;
        y1 = y;
        y2 = y;
        y3 = y + CUBESIZE;
        y4 = y + CUBESIZE;

    }

    @Override
    void rotateRight() {
        switch (k % 4) {
            //Cюда можно попасть из case 3
            case 0:
                System.out.print((k % 4) + "\n");
                x1l = x1 - 2 * CUBESIZE;
                x2l = x2 - CUBESIZE;
                x3l = x3;
                x4l = x4 + CUBESIZE;
                y1l = y1;
                y2l = y2 - CUBESIZE;
                y3l = y3;
                y4l = y4 - CUBESIZE;
                if ((x1l < CUBESIZE * 9) && (x2l < CUBESIZE * 9) && (x3l < CUBESIZE * 9) && (x4l < CUBESIZE * 9) && (x1l > 0) && (x2l > 0) && (x3l > 0) && (x4l > 0) && (y1l < CUBESIZE * 9) && (y2l < CUBESIZE * 9) && (y3l < CUBESIZE * 9) && (y4l < CUBESIZE * 9)) {

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
                x1l = x1 + 2 * CUBESIZE;
                x2l = x2 + CUBESIZE;
                x3l = x3;
                x4l = x4 - CUBESIZE;
                y1l = y1;
                y2l = y2 + CUBESIZE;
                y3l = y3;
                y4l = y4 + CUBESIZE;
                if ((x1l < CUBESIZE * 9) && (x2l < CUBESIZE * 9) && (x3l < CUBESIZE * 9) && (x4l < CUBESIZE * 9) && (x1l > 0) && (x2l > 0) && (x3l > 0) && (x4l > 0) && (y1l < CUBESIZE * 9) && (y2l < CUBESIZE * 9) && (y3l < CUBESIZE * 9) && (y4l < CUBESIZE * 9)) {
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
                x1l = x1 - 2 * CUBESIZE;
                x2l = x2 - CUBESIZE;
                x3l = x3;
                x4l = x4 + CUBESIZE;
                y1l = y1;
                y2l = y2 - CUBESIZE;
                y3l = y3;
                y4l = y4 - CUBESIZE;
                if ((x1l < CUBESIZE * 9) && (x2l < CUBESIZE * 9) && (x3l < CUBESIZE * 9) && (x4l < CUBESIZE * 9) && (x1l > 0) && (x2l > 0) && (x3l > 0) && (x4l > 0) && (y1l < CUBESIZE * 9) && (y2l < CUBESIZE * 9) && (y3l < CUBESIZE * 9) && (y4l < CUBESIZE * 9)) {
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
                x1l = x1 + 2*CUBESIZE;
                x2l = x2 + CUBESIZE;
                x3l = x3;
                x4l = x4 - CUBESIZE;
                y1l = y1;
                y2l = y2 + CUBESIZE;
                y3l = y3;
                y4l = y4 + CUBESIZE;
                if ((x1l < CUBESIZE * 9) && (x2l < CUBESIZE * 9) && (x3l < CUBESIZE * 9) && (x4l < CUBESIZE * 9) && (x1l > 0) && (x2l > 0) && (x3l > 0) && (x4l > 0) && (y1l < CUBESIZE * 9) && (y2l < CUBESIZE * 9) && (y3l < CUBESIZE * 9) && (y4l < CUBESIZE * 9)) {
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
