package MyException;

import java.io.*;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws FileNotFoundException {
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

        /*do 9 version*/
        try(OutputStream outputStream = new FileOutputStream("temp.txt")){

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        /*c 9 version*/
        OutputStream outputStream = new FileOutputStream("temp.txt");
        try(outputStream) {
            outputStream.write(111);
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
