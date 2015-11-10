import java.awt.*;


/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    static int WIDTH = Window.WIDTH;
    static int HEIGHT = Window.HEIGHT + 1;
    private boolean[][] matrix = new boolean[WIDTH + 2][HEIGHT];

    Memory() {
        for (int k = 0; k < WIDTH + 1; k++) {
            matrix[k][HEIGHT - 1] = true;
        }

        for (int k = 0; k < HEIGHT; k++) {
            matrix[0][k] = true;
        }

        for (int k = 0; k < HEIGHT; k++) {
            matrix[WIDTH + 1][k] = true;
        }

    }

    public void absorbFigure(Shape shape) {
        matrix[shape.x1 / Window.CUBESIZE + 1][shape.y1 / Window.CUBESIZE] = true;
        matrix[shape.x2 / Window.CUBESIZE + 1][shape.y2 / Window.CUBESIZE] = true;
        matrix[shape.x3 / Window.CUBESIZE + 1][shape.y3 / Window.CUBESIZE] = true;
        matrix[shape.x4 / Window.CUBESIZE + 1][shape.y4 / Window.CUBESIZE] = true;

    }

    public boolean[][] getMatrix() {
        return matrix;

    }

    public void printMatrix(Graphics graphics) {
        //� WIDTH ������ +1 � HEIGHT -1
        for (int c = 1; c < WIDTH + 1 + 1; c++) {
            for (int k = 0; k < HEIGHT; k++) {
                if (matrix[c][k]) {
                    graphics.setColor(Color.black);
                    graphics.fillRect((c - 1) * Window.CUBESIZE, k * Window.CUBESIZE, Window.CUBESIZE, Window.CUBESIZE);
                    graphics.setColor(Color.white);
                    graphics.drawRect((c - 1) * Window.CUBESIZE, k * Window.CUBESIZE, Window.CUBESIZE, Window.CUBESIZE);
                }
            }
        }
    }

    public void fill(int c, boolean bl) {
        for (int k = 0; k < WIDTH + 1; k++) {
            matrix[k][c] = bl;
        }
    }


    public void pushUpper(int inputRow) {
        for (int c = inputRow; c > 0; c--) {
            for (int k = 0; k < WIDTH + 1; k++) {
                matrix[k][c] = matrix[k][c - 1];
            }
        }
    }

    public void cleanRow() {
        //Тут опять ошибка
        int c = 0;
        boolean canWeDo;
        for (; c < HEIGHT - 1; c++) {
            canWeDo = true;
            for (int k = 0; k < WIDTH + 1; k++) {
                if (!matrix[k][c]) {
                    canWeDo = false;
                    break;
                }
            }
            if (canWeDo) {
                System.out.println("Clean it!");
                fill(c, false);
                pushUpper(c);
                //Here code delete fill false, move all, which higher y++
            }
        }
    }
}