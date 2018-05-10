package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyFocus {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Работа с фокусами на элементах
        jPanel.add(new JButton("one"));
            //Недоступный фокус
        jPanel.add(new JButton("two")).setFocusable(false);
            //назначение активного фокуса
        jPanel.add(new JButton("three")).requestFocusInWindow();

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
