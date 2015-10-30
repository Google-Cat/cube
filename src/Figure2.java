/**
 * Created by quwantoq on 19.10.15.
 */
public class Figure2 extends Shape {
    public Figure2(int x, int y) {
        x1 = x;
        x2 = x;
        x3 = x + CUBESIZE;
        x4 = x + CUBESIZE;
        y1 = y;
        y2 = y + CUBESIZE;
        y3 = y;
        y4 = y + CUBESIZE;

    }

    @Override
    boolean isAnyThingUnderFigure(Memory memory) {
        //Красный-1
        //Черный-2
        //Синий-3
        //Бирюзовый-4
        boolean bln = false;

        if (memory.getMatrix()[x2 / CUBESIZE][y2 / CUBESIZE + 1] == true || memory.getMatrix()[x4 / CUBESIZE][y4 / CUBESIZE + 1] == true) {
            bln = true;

        }

        return bln;

    }

}
