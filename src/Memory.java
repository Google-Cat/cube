import java.awt.*;


/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    static final int n = 11;
    static final int m = 11;
    static final int CUBESIZE = 20;
    boolean[][] matrix = new boolean[n][m];

    Memory() {
        for (int k = 0; k < m; k++) {
            matrix[k][10] = true;
        }
    }

    public boolean[][] getMatrix() {
        return matrix;
    }

    public void printMatrix(Graphics graphics) {

        for (int c = 0; c < 10; c++) {
            for (int k = 0; k < 10; k++) {
                if (matrix[c][k]) {
                    graphics.setColor(Color.black);
                    graphics.fillRect(c * CUBESIZE, k * CUBESIZE, CUBESIZE, CUBESIZE);
                    graphics.setColor(Color.white);
                    graphics.drawRect(c * CUBESIZE, k * CUBESIZE, CUBESIZE, CUBESIZE);
                }
            }


        }


    }

}
