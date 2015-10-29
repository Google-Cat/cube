import java.util.Arrays;

/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    final int n = 10;
    final int m = 10;
    boolean[][] matrix = new boolean[n][m];
    Memory(){
        for (int k = 0; k < m; k++) {
            matrix[9][k] = true;
        }
    }

    public boolean[][] getMatrix() {

        return matrix;
    }


}
