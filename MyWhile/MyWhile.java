package MyWhile;

import java.util.Scanner;

public class MyWhile {
    public static void main(String[] args){

        int myInt = 0;
        while(true){
            System.out.println(myInt);
            if(myInt == 3){
                break; //Прирывает цикл
            }
            myInt++;
        }

        int myInt1;
        Scanner myScanner = new Scanner(System.in);
        do{
            System.out.println("Введите 5");
            myInt1 = myScanner.nextInt();
        } while (myInt1 != 5);
    }
}
