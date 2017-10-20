package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyStartSwing {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(){}; //Окно создано
        jFrame.setVisible(true); //Отображаем на экране
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Делаем чтоб можно было закрыть окно

        //Помогает определить размер экрана
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jFrame.setTitle("Test"); //Заголовок

        //Определение шрифтов
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String s : fonts) {
            System.out.println(s);
        }
    }
}
