package MyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args){
        //Error - лучше не отлавливать try и catch потому как это ошибки выше. Только Exception

        //checked
            //throw new Throwable();
            //throw new Exception();
            //throw new IOException();

        //unchecked
            //throw new Error();
            //throw new RuntimeException();

        File myFile = new File("abc");

        try {
            Scanner myScanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("Фаил не найден"); //Переопределяем ошибку
        } finally {
            System.exit(0); //так можно прервать finally
            System.out.println("Произошла ошибка или нет он все ровно выполнится");
        }


    }
}
