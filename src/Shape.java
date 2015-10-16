import sun.security.pkcs11.wrapper.CK_UNLOCKMUTEX;

/**
 * Created by lunin_000 on 11.10.2015.
 */
 class Shape {

    static final int CUBESIZE = 30;
    int x1;
    int x2;
    int x3;
    int x4;
    int y1;
    int y2;
    int y3;
    int y4;

    Shape(){
    }


   /*......     ........       ... ..          ......         .....--         ...  ..
    ..-..      ..:..-.        ..:...         ...:..          ...:-..         .-.:-..          .--.:.-.
            FIGURE1      FIGURE2     FIGURE3         FIGURE4          FIGURE5      FIGURE6             FIGURE7      :*:               .-
            .......................................................................................................
            -+***.                   .....              .....
            -+**:.                   =+++.              *%%@+         .........                         .....
            -+++*.    --:-:----.     =+++.              +%%@+        .%%%%@%%%+   *%%%@%%%%-            ++++:
            -=+*:.    :=+*+****-     ===+.              *%%%+        .@@@@@@@@+   *@@@@@@@@-            ====:
            -+==*.    :++++++++-     ===+.              *%%%+    :%%%@%%=%:           -%==%@%%%+   -+++====+=++++
            -+**:.    :***+****-     =+++++++:     .=%%@+%%@+    :%%%@%%%%:           -%%%%@%%%+   -+++======++++
            -+++*.    :===+====-     =+++++++-     .=%%@+%%@+
            -+**:.
            -+**:.
*/



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
    void moveDown( ) {
        if ((y1 < CUBESIZE*9) && (y2 < CUBESIZE*9) && (y3 < CUBESIZE*9) && (y4 < CUBESIZE*9)){
            y1 += CUBESIZE;
            y2 += CUBESIZE;
            y3 += CUBESIZE;
            y4 += CUBESIZE;
        }


    }
     void rotateRight(){

     }

    String getData(){


        return ("x1="+this.x1+ " y1=" + this.y1);
    }
    @Override
    public String toString() {
        return "("+")";
    }
}

