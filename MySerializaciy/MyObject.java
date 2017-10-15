package MySerializaciy;

import java.io.*;

public class MyObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MySerializaciy nom1 = new MySerializaciy(1, "One");
        MySerializaciy nom2 = new MySerializaciy(2, "Two");

        //Записываем
        FileOutputStream fos = new FileOutputStream("src/MySerializaciy/test.bin"); //Фаил можно оставить без разрешения и написать просто test, но мы записываем бинарные данные
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(nom1);
        oos.close();

        //Читаем
        FileInputStream fileInputStream = new FileInputStream("src/MySerializaciy/test.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MySerializaciy mySerializaciy = (MySerializaciy) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(mySerializaciy.getName());

    }
}
