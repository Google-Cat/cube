import java.awt.*;


/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    static int WIDTH = Window.WIDTH;
    static int HEIGTH = Window.HEIGTH + 1;
    private boolean[][] matrix = new boolean[WIDTH][HEIGTH];

    Memory() {
        for (int k = 0; k < WIDTH; k++) {
            matrix[k][HEIGTH - 1] = true;
        }
    }

    public boolean[][] getMatrix() {
        return matrix;
    }

    public void printMatrix(Graphics graphics) {

        for (int c = 0; c < WIDTH; c++) {
            for (int k = 0; k < HEIGTH; k++) {
                if (matrix[c][k]) {
                    graphics.setColor(Color.black);
                    graphics.fillRect(c * Window.CUBESIZE, k * Window.CUBESIZE, Window.CUBESIZE, Window.CUBESIZE);
                    graphics.setColor(Color.white);
                    graphics.drawRect(c * Window.CUBESIZE, k * Window.CUBESIZE, Window.CUBESIZE, Window.CUBESIZE);
                }
            }
        }
    }

    public void fill(int c, boolean bl) {
        for (int k = 0; k < WIDTH; k++) {
            matrix[k][c] = bl;
        }
    }


    public void pushUpper(int inputRow) {
        for (int c = inputRow; c > 0; c--) {
            for (int k = 0; k < WIDTH; k++) {
                matrix[k][c] = matrix[k][c - 1];
            }
        }
    }

    public void cleanRow() {
        int c = 0;
        boolean canWeDo;
        for (; c < HEIGTH - 1; c++) {
            canWeDo = true;
            for (int k = 0; k < 10; k++) {
                if (!matrix[k][c]) {
                    canWeDo = false;
                    break;
                }
                //??????? ?? ?????? ???????, ???? canWeDo ? ??? ????????, ???? false ?? ???
                //?????? ??? ????? ?? ????????
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