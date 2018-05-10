package MySwing;

import javax.swing.*;
import java.awt.*;


public class MySoundRoad {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        //можно использовать для регулеровки музыки
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
            //шкала
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
            //отрисовка
        jSlider.setPaintTicks(true);
            //округление
        jSlider.setSnapToTicks(true);
            //вывод на шкалу цифр
        jSlider.setPaintLabels(true);



        jPanel.add(jSlider);

        jPanel.revalidate();
    }



    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setTitle("Test");

        return jFrame;
    }
}
