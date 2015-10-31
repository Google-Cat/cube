import java.awt.*;
import java.util.Arrays;

/**
 * Created by quwantoq on 21.10.15.
 */
public class Memory {
    final int n = 11;
    final int m = 11;
    final int CUBESIZE = 20;
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
        //тут пробежка по всему массиву, где true печать квадратика
       for (int c=0;c<10;c++){
           for (int k=0;k<10;k++){
               if (matrix[c][k]){
                   System.out.println("Time to print rect with coordinates " + c + "and " +k);
                   graphics.drawRect(c*CUBESIZE,k*CUBESIZE,CUBESIZE,CUBESIZE);
               }
           }



       }
        System.out.println("Let's talk about [5][5] and it's " + matrix[5][5]);

        //graphics.fillRect(20,20,20,20);

       /*
       Code here
        */

    }

}
