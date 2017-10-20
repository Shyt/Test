package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLookAndFeel {
    public static void main(String[] args) {
        //Стили дизайна для Swing
        //UIManager.LookAndFeelInfo[] lookAndFeelInfo = UIManager.getInstalledLookAndFeels();
        //for (UIManager.LookAndFeelInfo lookAndFeelInfo1 : lookAndFeelInfo){
        //    System.out.println(lookAndFeelInfo1.getName());
        //    System.out.println(lookAndFeelInfo1.getClassName());
        //}

        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton jButton1 = new JButton("Metal");
        JButton jButton2 = new JButton("Nimbus");
        JButton jButton3 = new JButton("Motif");
        JButton jButton4 = new JButton("Windows");
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
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
