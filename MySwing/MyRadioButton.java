package MySwing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MyRadioButton {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Checkbox
        JCheckBox jCheckBox = new JCheckBox("check box label");
        jCheckBox.setSelected(true);
        jPanel.add(jCheckBox);

        //RadioButton
        JRadioButton jRadioButton1 = new JRadioButton("one");
        JRadioButton jRadioButton2 = new JRadioButton("two");
        jRadioButton2.setSelected(true);
            //помещаем чтоб был выбор
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);

        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);

        //Выпадающий выбор
        JComboBox<String> comboBox = new JComboBox();
        comboBox.addItem("One");
        comboBox.addItem("Two");
            //порядок вставления
        comboBox.insertItemAt("three", 0);
        jPanel.add(comboBox);

        //Border
        Border border = BorderFactory.createEtchedBorder();
            //title border
        Border border1 = BorderFactory.createTitledBorder(border,"title");
        jPanel.setBorder(border1);

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
