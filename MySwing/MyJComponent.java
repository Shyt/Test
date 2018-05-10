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

        //Узнать шрифты
        //String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        //for(String s : fonts){
        //    System.out.println(s);
        //}

        //jComponent
        jFrame.add(new MyComponent());

    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            //настройки шрифта
            Font font = new Font("Arial", Font.ITALIC, 20);

            //переход на 2д
            Graphics2D g2 = (Graphics2D) g;

            //Рисуем текст
            g2.setFont(font);
            g2.drawString("Hello World!", 50, 50);

            //цвет рисования
            g2.setPaint(Color.pink);
            //g2.setColor(Color.black);
            //g2.setPaint(new Color(105,85,36));

            //Рисуем линию
        /*
                // Точки
            Point2D p1 = new Point2D.Double(0,0);
            Point2D p2 = new Point2D.Double(100,140);

            Line2D l2 = new Line2D.Double(p1, p2); //Можно так
        */
            Line2D l2 = new Line2D.Double(70, 70, 150, 150); //Можно float тоже самое,  легче но нужно ставить 0f, 0f, 100f, 140f
            g2.draw(l2);

            //Рисуем эллипс
            Ellipse2D ellipse2D = new Ellipse2D.Double(70,70,150,150);
            //g2.fill(ellipse2D);
            g2.draw(ellipse2D);

            //Ректангл
            Rectangle2D rectangle2D = new Rectangle2D.Double(70,70,150,150);
            g2.draw(rectangle2D);

            //Изображение
            try{
                //по урлу
                URL url = new URL("https://scontent-frt3-1.cdninstagram.com/vp/a91b8efa004e5108406ca4f1c928d939/5B6D752A/t51.2885-19/s150x150/20759065_1831674023509757_1346026313726558208_a.jpg");
                Image image = new ImageIcon(url).getImage();
                //g2.drawImage(image, 250, 70, null);
            }catch (MalformedURLException e){
                e.printStackTrace();
            }
            //по папке
            Image image2 = new ImageIcon("src/MySwing/img/java.png").getImage();
            g2.drawImage(image2, 220, 50, null);

        }
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);

        //close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //size screen
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        jFrame.setBounds(dimension.width/2-250, dimension.height/2-150, 500, 300);
        return jFrame;

    }
}
