/**
 * Created by lunin_000 on 11.10.2015.
 */
public class Shape {
    enum ShapeType {
        FIGURE1,FIGURE2,FIGURE3,FIGURE4,FIGURE5,FIGURE6,FIGURE7
    }
    final int CUBESIZE = 30;
    int x1;
    int x2;
    int x3;
    int x4;
    int y1;
    int y2;
    int y3;
    int y4;

   //Default position http://codenjoy.com/portal/wp-content/uploads/2012/11/13.png
    public Shape (ShapeType st, int inputX, int inputY){
        switch (st){
            case FIGURE1:
                x1 = inputX;
                x2 = inputX;
                x3 = inputX;
                x4 = inputX;
                y1 = inputY;
                y2 = y1 + CUBESIZE;
                y3 = y2 + CUBESIZE;
                y4 = y3 + CUBESIZE;
                break;
        }
    }
    void moveRight( ) {
        if ((x1 < CUBESIZE*9) && (x2 < CUBESIZE * 9) && (x3 < CUBESIZE * 9) && (x4 < CUBESIZE * 9) ) {
            x1 += CUBESIZE;
            x2 += CUBESIZE;
            x3 += CUBESIZE;
            x4 += CUBESIZE;
        }

    }
    void moveLeft ( ) {
        if ((x1 > 0) && (x2 > 0) && (x3 > 0) && (x4 > 0)) {
            x2 -= CUBESIZE;
            x3 -= CUBESIZE;
            x4 -= CUBESIZE;
            x1 -= CUBESIZE;
        }
    }



    @Override
    public String toString() {
        return "("+")";
    }
}
