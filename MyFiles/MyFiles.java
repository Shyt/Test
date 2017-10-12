package MyFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MyFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("src/MyFiles/test2");

        Scanner myScanner = new Scanner(myFile);
        String line = myScanner.nextLine(); //Мы знаем что у нас одна строка
        String[] myNamberString = line.split(" ");
        int[] myNambers = new int[3];
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
