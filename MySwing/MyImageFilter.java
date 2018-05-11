package MySwing;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

public class MyImageFilter {
    public static void main(String[] args) throws IOException {
        //Загрузка изображения
        File file = new File("src/MySwing/img/java.png");
        BufferedImage image = ImageIO.read(file);

        //Создаем на подобие нашего рисунка загатовку
        BufferedImage newImage = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        //Заготовк поворачиваем на 45 градусов
        AffineTransform affineTransform = AffineTransform.getRotateInstance(45, image.getWidth() / 2, image.getHeight() / 2);
        BufferedImageOp op = new AffineTransformOp(affineTransform, AffineTransformOp.TYPE_BILINEAR);
        //На одну картинку накладываем эффекты другой
        op.filter(image, newImage);

        //Сохраняем картинку
        ImageIO.write(newImage, "jpg", new File("src/MySwing/img/new.jpg"));

    }
}
