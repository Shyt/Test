package MyFiles;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class MyFiles {
    public static void main(String[] args) throws IOException {

        //Записываем
        File myFile = new File("src/MyFiles/test2");
        if(!myFile.exists()){ //Проверка есть ли файл
            //myFile.mkdir(); //Создание дериктории
            //myFile.createNewFile(); //Создание файла
        }
        if(myFile.isDirectory()){
            System.out.println("Проверяем это дериктория?");
        }
        if(myFile.isFile()){
            System.out.println("Проверяем это Фаил");
        }

        //Записывать
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush(); //Записываем
        //fileWriter.close(); //Закрываем

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine(); //Перенос на новую строку вместо \n
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        //Читать
        FileReader fileReader = new FileReader(myFile);
        //char[] chars = new char[20];
        //fileReader.read(chars);
        //System.out.println(chars);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine()); //Читаем по строчно
        }




/*
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


        //while(myScanner.hasNextLine()){
            //System.out.println(myScanner.nextLine()); //Массив строк в текстовом файле
        //}

        myScanner.close();
*/
    }
}
