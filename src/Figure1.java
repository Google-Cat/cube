/**
 * Created by quwantoq on 16.10.15.
 */
public class Figure1 extends Shape {

    public Figure1(int x, int y) {
        x1 = x;
        x2 = x;
        x3 = x;
        x4 = x;
        y1 = y;
        y2 = y+CUBESIZE;
        y3 = y+CUBESIZE*2;
        y4 = y+CUBESIZE*3;
    }

    @Override
    void rotateRight() {
        this.x2 = this.x2 + CUBESIZE;
        this.x3 = this.x3 + CUBESIZE*2;
        this.x4 = this.x4 + CUBESIZE*3;
        this.y2 = this.y2 - CUBESIZE;
        this.y3 = this.y3 - CUBESIZE*2;
        this.y4 = this.y4 - CUBESIZE*3;

    }
}
