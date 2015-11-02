
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by quwantoq on 06.10.15
 */
public class Window {
    static Memory m = new Memory();

    public static void main(String[] args) {

        Printer p = new Printer();
        JFrame f = new JFrame();

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        f.setVisible(true);
        f.getContentPane().setPreferredSize(new Dimension(p.CUBESIZE * 10, p.CUBESIZE * 10));
        f.pack();
        //m.matrix[5][5] = true;
        //System.out.println(m.matrix[5][5]);
        //System.out.println("Current matrix (1) =" + Arrays.deepToString(m.getMatrix()));
        //Тут я препятствие поставил
        // System.out.println(m.getMatrix());
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                p.f1.moveDown();
                //Отправка в память, если под ней есть, что либо
                if (p.f1.isAnyThingUnderFigure(m)) {
                    p.f1.sendToMemory(m);
                    p.f1.sendToTop();
                    //System.out.println("Current matrix (2) =" + Arrays.deepToString(m.getMatrix()));
                }
                p.repaint();


            }
        });
        timer.start();


    }

}


