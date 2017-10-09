package MyScanner;

import java.util.Scanner;

public class MyScanner{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String myString = myScanner.nextLine(); //считает с клавиатуры одну строчку чего либо
        System.out.println(myString);

        //String str = myScanner.nextLine(); //- полная строка
        //String str = myScanner.next(); - одно слово из строки
        //int myInt = myScanner.nextInt(); - для чтения целочисленных значении
        //double myDouble = myScanner.nextDouble(); - для чтения числового значенияс плавающей точкой
    }
}
