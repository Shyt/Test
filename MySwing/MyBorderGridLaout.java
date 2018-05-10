package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyBorderGridLaout {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
        jFrame.add(new JButton("north"), BorderLayout.NORTH);
        jFrame.add(new JButton("west"), BorderLayout.WEST);
        jFrame.add(new JButton("south"), BorderLayout.SOUTH);
        jFrame.add(new JButton("east"), BorderLayout.EAST);
        jFrame.add(new JButton("center"), BorderLayout.CENTER);

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
