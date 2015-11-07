import java.util.Random;

/**
 * Created by lunin_000 on 11.10.2015.
 */
class Shape {
    static int CUBESIZE = Window.CUBESIZE;
    byte k = 1;


    int x1;
    int x2;
    int x3;
    int x4;
    int y1;
    int y2;
    int y3;
    int y4;
    // Переменные для проверки на поворот
    int x1l;
    int x2l;
    int x3l;
    int x4l;
    int y1l;
    int y2l;
    int y3l;
    int y4l;


    Shape() {
    }


    /*
             FIGURE1      FIGURE2     FIGURE3         FIGURE4          FIGURE5      FIGURE6             FIGURE7                     .-
             .......................................................................................................
             ++++                   ++++                ++++
             ++++                   ++++                ++++
             ++++    ++++++++++     ++++                ++++        ++++++++++   ++++++++++            ++++
             ++++    ++++++++++     ++++                ++++        ++++++++++   ++++++++++            ++++
             ++++    ++++++++++     ++++                ++++    ++++++++++           ++++++++++   ++++++++++++++
             ++++    ++++++++++     +++++++++      +++++++++    ++++++++++           ++++++++++   ++++++++++++++
             ++++    ++++++++++     +++++++++      +++++++++                        Красный глючит
             ++++
             ++++
 */
    public Shape shapeFactory() {
        Random rand = new Random();
        int r = rand.nextInt(7);
        switch (r) {
            case 0:
                return new Figure1(0, 0);
            case 1:
                return new Figure2(0, 0);
            case 2:
                return new Figure3(0, 0);
            case 3:
                return new Figure4(0, 0);
            case 4:
                return new Figure5(0, 0);
            case 5:
                return new Figure6(0, 0);
            case 6:
                return new Figure7(0, 0);
        }
        return null;
    }

    public void sendToMemory(Memory memory) {
        memory.getMatrix()[this.x1 / CUBESIZE][this.y1 / CUBESIZE] = true;
        memory.getMatrix()[this.x2 / CUBESIZE][this.y2 / CUBESIZE] = true;
        memory.getMatrix()[this.x3 / CUBESIZE][this.y3 / CUBESIZE] = true;
        memory.getMatrix()[this.x4 / CUBESIZE][this.y4 / CUBESIZE] = true;


    }

    public String getInfo() {
        return "(x1;y1) (" + x1 / CUBESIZE + ";" + y1 / CUBESIZE + ") (x2;y2) (" + x2 / CUBESIZE + ";" + y2 / CUBESIZE + ") (x3;y3) (" + x3 / CUBESIZE + ";" + y3 / CUBESIZE + ") (x4;y4) (" + x4 / CUBESIZE + ";" + y4 / CUBESIZE + ")";
    }

    void moveRight() {
        if ((x1 < CUBESIZE * 9) && (x2 < CUBESIZE * 9) && (x3 < CUBESIZE * 9) && (x4 < CUBESIZE * 9)) {
            x1 += CUBESIZE;
            x2 += CUBESIZE;
            x3 += CUBESIZE;
            x4 += CUBESIZE;
        }

    }

    void moveLeft() {
        if ((x1 > 0) && (x2 > 0) && (x3 > 0) && (x4 > 0)) {
            x2 -= CUBESIZE;
            x3 -= CUBESIZE;
            x4 -= CUBESIZE;
            x1 -= CUBESIZE;
        }
    }

    void moveDown() {
        y1 += CUBESIZE;
        y2 += CUBESIZE;
        y3 += CUBESIZE;
        y4 += CUBESIZE;
    }

    void sendToTop() {
        //Need to rework!
        y1 -= 5 * CUBESIZE;
        y2 -= 5 * CUBESIZE;
        y3 -= 5 * CUBESIZE;
        y4 -= 5 * CUBESIZE;
    }

    void rotateRight() {

    }

    boolean isAnyThingUnderFigure(Memory memory) {
        if (memory.getMatrix()[x1 / CUBESIZE][y1 / CUBESIZE + 1] == true || memory.getMatrix()[x2 / CUBESIZE][y2 / CUBESIZE + 1] == true || memory.getMatrix()[x3 / CUBESIZE][y3 / CUBESIZE + 1] == true || memory.getMatrix()[x4 / CUBESIZE][y4 / CUBESIZE + 1] == true) {
            return true;

        } else return false;
    }


    @Override
    public String toString() {
        return "(" + ")";
    }
}

