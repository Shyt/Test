package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class MyActionListener {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();

        //Добавляем панель
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("Кнопка"); //Добавили кнопку на панель
        jPanel.add(jButton);

        //Слушатель на кнопку, действие при активе
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));
    /*
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.DARK_GRAY); //Вся панельзальется этим цветом при клике на кнопку
                //jFrame.setTitle(((JButton)e.getSource()).getText()); get.Source - это от куда пришел из JButton и getText - это Кнопка.
            }
        });
    */
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300);
        jFrame.setTitle("Test");

        return jFrame;
    }
}
