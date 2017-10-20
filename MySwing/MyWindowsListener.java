package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
    Эффекты - например окно открылось, закрылось, свернулась, неактивно.
 */

public class MyWindowsListener {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        jFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {

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
