package MyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args){
        File myFile = new File("abc");

        try {
            Scanner myScanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден"); //Переопределяем ошибку
        }


    }
}
