package MySwing;

import javax.swing.*;
import java.awt.*;

public class MyCustomLayout {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.setLayout(new MyLayout());
        jPanel.add(new JButton("submit 1"));
        jPanel.add(new JButton("submit 2"));
        jPanel.add(new JButton("submit 3"));

        jPanel.revalidate();
    }

    static class MyLayout implements LayoutManager{
        @Override
        public void addLayoutComponent(String name, Component comp) {

        }

        @Override
        public void removeLayoutComponent(Component comp) {

        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            return null;
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            return null;
        }

        @Override
        public void layoutContainer(Container parent) {
            for(int i = 0; i < parent.getComponentCount(); i++){
                Component component = parent.getComponent(i);
                component.setBounds(i * 100, i * 40, 100, 40);
            }
        }
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
