package MySerializaciy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args){
        MySerializaciy nom1 = new MySerializaciy(1, "One");
        MySerializaciy nom2 = new MySerializaciy(2, "Two");

        try {
            FileOutputStream fos = new FileOutputStream("/src/MySerializaciy/test.bin"); //Фаил можно оставить без разрешения и написать просто test, но мы записываем бинарные данные
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
