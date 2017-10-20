package MySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class MyJComponent {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Arial", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);

            //Рисуем текст
            g2.drawString("Hello World!", 20, 20);

            //Рисуем линию
        /*
            Point2D p1 = new Point2D.Double(0,0);
            Point2D p2 = new Point2D.Double(100,140);
            Line2D l2 = new Line2D.Double(p1, p2); //Можно так
        */
            Line2D l2 = new Line2D.Double(0, 0, 100, 140); //Можно float тоже самое,  легче но нужно ставить 0f, 0f, 100f, 140f
            g2.draw(l2);

            //Рисуем эллипс
            Ellipse2D el = new Ellipse2D.Double(0,0,100,140);
            //el.setFrameFromDiagonal(p1, p2);
            //g2.setPaint(new Color(105,85,36)); //цвет
            g2.setPaint(Color.red);
            g2.draw(el); //Нарисовать
            //g2.fill(el); //Залить

            //Rectangle
            Rectangle2D r2 = new Rectangle2D.Double(0,0,100,140);
            //r2.setFrameFromDiagonal(p1,p2);
            g2.draw(r2);

            //Вывод картинки
            //try {
                //URL url = new URL(""); Вывести по ссылке
                Image image = new ImageIcon("img/test.jpg").getImage();
                g2.drawImage(image, 220, 50, null);
            //} catch (MalformedURLException e) {
                //e.printStackTrace();
            //}

        }
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
