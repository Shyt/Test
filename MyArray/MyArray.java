package MyArray;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args){
        int[] myArray = new int[10]; // Создали массив (0,0,0,0,0,0,0,0,0,0) - 10 элементов.

        for(int i=0; i< myArray.length; i++){
            System.out.print(myArray[i]);
        } // Прогон по всему массиву
        System.out.println("");

        for (int myInt: myArray) {
            System.out.print(myInt);
        }
        System.out.println("");

        System.out.println(Arrays.toString(myArray));

        int[] myArray2 = {0,5,2,3,4,1}; // Заправка массива
        System.out.println(Arrays.toString(myArray2));

        int[] myTest1 = Arrays.copyOf(myArray2, myArray2.length); //Копируем массив
        myTest1[2] = 25; // Изменяем
        System.out.println(myTest1[2]+" == "+myArray2[2]); //Изминение не подействовало на другой массив

        Arrays.sort(myArray2); //Сортировка
        System.out.println(Arrays.toString(myArray2));

        String[] myArray3 = {"Odin","Dva","One","Two"};
        int myInt2 = Arrays.binarySearch(myArray3,"Two");
        System.out.println(myInt2); // Позиция

        Arrays.fill(myArray,5); //Всему массиву назначает значение 5
        System.out.println(Arrays.toString(myArray)); //55555555555

        int[] x = {0,0};
        int[] y = {0,0};
        if(Arrays.equals(x,y)){
            System.out.println("True"); //true - Сравнивает массивы не только аргументов но и значений
        }

        int[][] myArray4 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(myArray4)); //Отображение двумерного массива
    }
}
