package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyDiologs {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        JButton jButton= new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(jPanel, "this is my dialog", "title", JOptionPane.ERROR_MESSAGE);
                //JOptionPane.showConfirmDialog(jPanel,"some message", "title", JOptionPane.YES_OPTION);
                //JOptionPane.showOptionDialog(jPanel, "message", "title", 0, 0, null, new Object[]{"one","two","three"}, "two");
                System.out.println(JOptionPane.showInputDialog(jPanel,"some dialog"));

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
