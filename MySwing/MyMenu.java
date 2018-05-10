package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
        //Создаем панель меню
        JMenuBar jMenuBar = new JMenuBar();

        //Добавляем на нее кнопки
        JMenu file = new JMenu("File");
        jMenuBar.add(file);
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(edit);
        JMenu help = new JMenu("Help");
        jMenuBar.add(help);

        //Добавление кнопок в file
        file.add(new JMenuItem("New"));
            //Мнемоник - с помощью его делают сочитание клавиш для открывания
        file.add(new JMenuItem("Open", 'O'));
            //Сделать не активной
        JMenuItem save = file.add(new JMenuItem("Save"));
        save.setEnabled(false);
            //separator - это чертачка по низу
        file.addSeparator();
            //Прописываем на копку действия
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Закрывает программу
                System.exit(0);
            }
        });
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

        //Добавляем кнопки в edit
        edit.add(new JMenuItem("Cut"));
        edit.add(new JMenuItem("Copy"));

        //Добавляем кнопки в help
        help.add(new JMenuItem("Forum"));

        //Добавляем внутрь еще настроек
        JMenu options = new JMenu("Options");
        edit.add(options);
        options.add("screen");

        //Выводим во фрейм
        jFrame.setJMenuBar(jMenuBar);


        jFrame.revalidate();
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
