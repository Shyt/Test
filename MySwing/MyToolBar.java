package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyToolBar {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        //toolbar - дополнительная панель всяких инстурментов
        JToolBar jToolBar = new JToolBar("title");
        JButton creat = new JButton("New");
        jToolBar.add(creat);
            //Вроде title на html
        creat.setToolTipText("Создание");
        jToolBar.add(new JButton("Open"));
            //separator - разделитель
        jToolBar.addSeparator();
        jToolBar.add(new JButton("Close"));

        jPanel.add(jToolBar);

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
