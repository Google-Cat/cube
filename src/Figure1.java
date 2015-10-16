/**
 * Created by quwantoq on 16.10.15.
 */
public class Figure1 extends Shape {
    byte k = 0;
    //Положение ротейшена вначале 0 (|)
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

        //4 позиции (0,1,2,3)
        k++;

        switch (k%4){
            //Cюда можно попасть из case 3
            case 0:
                x2=x2+CUBESIZE;
                x3=x3+2*CUBESIZE;
                x4=x4+3*CUBESIZE;
                y2=y2+CUBESIZE;
                y3=y3+2*CUBESIZE;
                y4=y4+3*CUBESIZE;
                System.out.print((k%4)+"\n");
                break;

            case 1:
                x2=x2+CUBESIZE;
                x3=x3+2*CUBESIZE;
                x4=x4+3*CUBESIZE;
                y2=y2-CUBESIZE;
                y3=y3-2*CUBESIZE;
                y4=y4-3*CUBESIZE;
                System.out.print((k%4)+"\n");
                break;
            case 2:
                x2=x2-CUBESIZE;
                x3=x3-2*CUBESIZE;
                x4=x4-3*CUBESIZE;
                y2=y2-CUBESIZE;
                y3=y3-2*CUBESIZE;
                y4=y4-3*CUBESIZE;
                System.out.print((k%4)+"\n");
                break;
            case 3:
                x2=x2-CUBESIZE;
                x3=x3-2*CUBESIZE;
                x4=x4-3*CUBESIZE;
                y2=y2+CUBESIZE;
                y3=y3+2*CUBESIZE;
                y4=y4+3*CUBESIZE;
                System.out.print((k%4)+"\n");
                break;


        }

        }
}
