package MySwing;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;
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
            //g2.setFont(font);
            //g2.drawString("Hello World!", 50, 50);

            //цвет рисования
            //g2.setPaint(Color.pink);
                //цвет с прозрачностью
            //g2.setColor(new Color(0f,0f,0f,0.3f));
            //g2.setPaint(new Color(105,85,36));
                //Гредиент
            //g2.setPaint(new GradientPaint(new Point2D.Double(0,0), Color.red, new Point2D.Double(200,100), Color.yellow));
                //Использование текстуры
            //try{
            //    g2.setPaint(new TexturePaint(ImageIO.read(new File("")), new Rectangle2D.Double(0,0,200,100)));
            //}catch(IOException e){
            //    e.printStackTrace();
            //}

            //Рисуем линию
        /*
                // Точки
            Point2D p1 = new Point2D.Double(0,0);
            Point2D p2 = new Point2D.Double(100,140);

            Line2D l2 = new Line2D.Double(p1, p2); //Можно так
        */
                //Толщина линии (Эффекты двух линий вместе закругление, остроту и тупой, Cap_Round, Join_Miter, Join_bevel)
            g2.setStroke(new BasicStroke(5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
            Line2D l2 = new Line2D.Double(70, 70, 150, 150); //Можно float тоже самое,  легче но нужно ставить 0f, 0f, 100f, 140f
            //g2.draw(l2);

            //Рисуем эллипс
            Ellipse2D ellipse2D = new Ellipse2D.Double(70,70,150,150);
                //Возможность изменять качество что позволяет быстрее загружать но хуже выглядит
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //хорошее качество
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF); //плохое качество
            //g2.fill(ellipse2D);
            //g2.draw(ellipse2D);

            //Ректангл
            Rectangle2D rectangle2D = new Rectangle2D.Double(70,70,150,150);
                //увеличить или уменьшить сохраняя пропорции
            //g2.scale(2, 2);
                //Сдвиг
            //g2.translate(50,50);
                //Трансформировать элемент
            //g2.shear(0.1,0.1);
                //Повернуть
            //g2.rotate(45);
                //Обрезание элемента по другому виду фигуры
            //Ellipse2D ellipse2D1 = new Ellipse2D.Double(70,70,150,150);
            //g2.clip(ellipse2D1);
                //Возможность контролировать наложение цвета если есть два рисунка и выбиратьдрминацию и позицию в использование типа z-index с прозрачностью
            g2.setComposite(AlphaComposite.SrcOver);

            //g2.draw(rectangle2D);
            ///g2.fill(rectangle2D);

            //Ректангл закругленными углами
            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(200,0,100,50,20,20);
            //g2.draw(roundRectangle2D);

            //Дуга
            QuadCurve2D quadCurve2D = new QuadCurve2D.Double(400,0,420,100,450,0);
            //g2.draw(quadCurve2D);

            //Изогнутая прямая
            CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(450,50,475,150,525,-50,550,50);
            //g2.draw(cubicCurve2D);

            //Обрезание элепса
            Arc2D arc2D = new Arc2D.Double(0,100,100,100,0,90, Arc2D.PIE);
            //g2.draw(arc2D);

            //лично можно что то нарисовать
            GeneralPath generalPath = new GeneralPath();
                //Начальная точка
            generalPath.moveTo(100,100);
                //Точка до куда
            generalPath.lineTo(200, 100);
                //Рисуем изгиб к одной точке
            generalPath.quadTo(250,200,300,100);
                //Рисуем изгиб к двум точкам
            generalPath.curveTo(325,200,375,0,400,100);
                //Для прорисовки замыкания линии
            generalPath.closePath();
            //g2.draw(generalPath);

            //Area - по мне так можно накладывать на друг друга разные фигуры и давать им z-index
            Area area = new Area(new Rectangle2D.Double(0,0,100,100));
            //area.add(new Area(new Ellipse2D.Double(50,50,150,150)));
            //area.subtract(new Area(new Ellipse2D.Double(50,50,150,150)));
            //area.intersect(new Area(new Ellipse2D.Double(50,50,150,150)));
            area.exclusiveOr(new Area(new Ellipse2D.Double(50,50,150,150)));
            //g2.fill(area);


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
            //g2.drawImage(image2, 220, 50, null);

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
