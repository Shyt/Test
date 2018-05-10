package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyJTextField {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        //label
        JLabel jLabel = new JLabel("this is label");
        jPanel.add(jLabel);

        //Поле для ввода, 20символов
        JTextField jTextField = new JTextField("default",20);
        //Все что будет введено выведется
        jPanel.add(jTextField);
        //System.out.println(jTextField.getText());


        //Поле для пароля
        JLabel jLabelu = new JLabel("this is label");
        jPanel.add(jLabelu);
        JTextField password = new JTextField(20);
        jPanel.add(password);

        //Поле area для много текста
        JTextArea jTextArea = new JTextArea(5, 20);
        jTextArea.setLineWrap(true); //переход на новую строчку.

        //scroll
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);

        //Он проверяет все прорисовки (repein тоже самое делает, но есть проблемы)
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
