import java.awt.*;


/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    static final int n = 10;
    static final int m = 11;
    static final int CUBESIZE = 20;
    boolean[][] matrix = new boolean[n][m];

    Memory() {
        for (int k = 0; k < n; k++) {
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

    public void fill(int c) {
        for (int k = 0; k < n; k++) {
            matrix[k][c] = false;
        }
    }

    public void cleanRow() {
        int c = 0;
        boolean canWeDo;
        for (; c < 10; c++) {
            canWeDo = true;
            for (int k =0; k < 10; k++) {
                if (!matrix[k][c]) {
                    canWeDo = false;
                    break;
                }
                //Вердикт по поводу массива, если canWeDo о нам подходит, елси false то нет
                //Походу эта штука не работает
            }
            if (canWeDo) {
                System.out.println("Clean it!");
                fill(c);
                //Here code delete fill false, move all, which higher y++
            }
        }
    }
}