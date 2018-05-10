package MySwing;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;

public class MyFileDialog {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Позволяет выбирать файлы
                JFileChooser fileChooser = new JFileChooser();
                    //Указание директории
                //fileChooser.setCurrentDirectory(new File("C://Windows/"));
                    //SelectedFile
                //fileChooser.setSelectedFile(new File("."));
                    //Выбор сразу несколько файлов
                fileChooser.setMultiSelectionEnabled(true);
                    //Выбор что передавать только фаилы, директории
                //fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                    //filter на выбор
                fileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File f) {
                        if(f.getName().endsWith("gif")){ // показывает только картинки формат gif
                            return true;
                        }else{
                            return false;
                        }
                    }

                    @Override
                    public String getDescription() {
                        return "only gif filter"; // информация что он открывает
                    }
                });

                //Добавление элементов
                TextField textField = new TextField("Выбор", 10);
                fileChooser.add(textField, BorderLayout.NORTH);

                //preview можно просмотреть перед тем как подтвердить (не доделано)
                //fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
                //    @Override
                //    public void propertyChange(PropertyChangeEvent evt) {
                //        textField.setText(evt.getNewValue().toString());
                //    }
                //});

                //Встроенный набор названий кнопок
                //fileChooser.showOpenDialog(jPanel); //Первый вариант - есть кнопка открыть
                //fileChooser.showSaveDialog(jPanel); //Второй вариант - есть кнопка сохранить
                // Свой вариант названий кнопок
                int i = fileChooser.showDialog(jPanel, "формат C");

                //Условие выбора cancel или ok
                System.out.println(i); //1 - cancel

                //Имя и расширение выбраного файла
                File file = fileChooser.getSelectedFile();
                System.out.println(file.getName());

            }
        });

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