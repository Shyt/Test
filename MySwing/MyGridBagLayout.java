package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyGridBagLayout {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        //таблицный layout
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        //Первый объект
        GridBagConstraints constraints1 = new GridBagConstraints();
            //Длинна и ширина
        constraints1.weightx = 0;
        constraints1.weighty = 0;
            //Начальные точки
        constraints1.gridx = 0;
        constraints1.gridy = 0;
            //Сколько клеток он будет занимать
        constraints1.gridwidth = 2;
        constraints1.gridheight = 2;
            //Добавляем textArea
        jPanel.add(new JTextArea(5,20), constraints1);

        //Второй объект
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;
        constraints2.weighty = 0;
        constraints2.gridx = 2;
        constraints2.gridy = 0;
        constraints2.gridwidth = 2;
        constraints2.gridheight = 1;
        jPanel.add(new JButton("Большая"), constraints2);

        //Третий объект
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;
        constraints3.weighty = 0;
        constraints3.gridx = 2;
        constraints3.gridy = 1;
        constraints3.gridwidth = 1;
        constraints3.gridheight = 1;
        jPanel.add(new JButton("Маленькая"), constraints3);

        //Четвёртый объект
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;
        constraints4.weighty = 0;
        constraints4.gridx = 3;
        constraints4.gridy = 1;
        constraints4.gridwidth = 1;
        constraints4.gridheight = 1;
        jPanel.add(new JButton("Маленькая"), constraints4);


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