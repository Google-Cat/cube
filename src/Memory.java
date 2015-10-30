import java.util.Arrays;

/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    final int n = 11;
    final int m = 11;
    boolean[][] matrix = new boolean[n][m];
    Memory(){
        for (int k = 0; k < m; k++) {
            matrix[k][10] = true;
        }
    }

    public boolean[][] getMatrix() {

        return matrix;
    }


}
