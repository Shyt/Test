package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseListener {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);

        //Обработчик мыши
        jPanel.addMouseListener(new MouseAdapter() { //MouseAdapter - он позволяет обрабатывать что тебе требуется а не вызывать все методы
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                jPanel.setBackground(Color.DARK_GRAY); // - нажатие мыши цвет меняется.
            }
        });

        //слежение за мышью
        JComponent jComponent = new MyJComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyJComponent.xCoord = e.getX();
                MyJComponent.yCoord = e.getY();
                jComponent.repaint(); // перерисовывает
            }
        });
    }

    static class MyJComponent extends JComponent{
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x:" + xCoord + " y:" + yCoord, 50, 50);
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
