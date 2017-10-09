package MySwing;

import javax.swing.*;
import java.awt.*;

public class MySwing {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {

                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //завершает работу при закрывание окна
                //frame.setUndecorated(false); - скрывает панели
                frame.setLocationByPlatform(true); //определяет положение автоматом
                frame.setTitle("Тест"); //title окошка
                frame.setVisible(true); //Отображение окна
                frame.toFront(); //Выводит по верх окон
            }
        });
    }
}

class SimpleFrame extends JFrame {
    Toolkit kit = Toolkit.getDefaultToolkit(); //Определяем размер экрана
    Dimension screenSize = kit.getScreenSize(); //Определяем ширину и высоту экрана

    public SimpleFrame(){
        add(new myComponent());
        pack();
        setSize(screenSize.width/2, screenSize.height/2);
    }
}

class myComponent extends JComponent{
    public void paintComponent(Graphics g){
        g.drawString("Hello World", 100, 100);
    }
}