package MyFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;


public class MyFiles {
    public static void main(String[] args) throws FileNotFoundException {

        //Записываем
        File myFile = new File("src/MyFiles/test2");
        PrintWriter pw = new PrintWriter(myFile); //Он может записывать только текст, но не байты информации
        pw.println("5 6 7 8");
        pw.close();

        //Читаем
        File myFile2 = new File("src/MyFiles/test2");
        Scanner myScanner = new Scanner(myFile2);
        String line = myScanner.nextLine(); //Мы знаем что у нас одна строка
        String[] myNamberString = line.split(" ");
        int[] myNambers = new int[4];
        int counter = 0;

        for(String number : myNamberString){
            myNambers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(myNambers));

        /*
        while(myScanner.hasNextLine()){
            System.out.println(myScanner.nextLine()); //Массив строк в текстовом файле
        }
        */
        myScanner.close();
    }
}
