package MyString;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args){
        String str = "Welcome!";
        String str2 = "Добро пожаловать! == Welcome!";
        String str3 = " _Welcome_ ";

        char myChar1 = str.charAt(0); //Возращает символ, расположенный на указанной позиции.
        System.out.println(myChar1);

        int myInt1 = str.codePointAt(0); //Возращает кодовую точку, начало или конец которой находится на указанной позиции
        System.out.println(myInt1);

        int myInt2 = str.offsetByCodePoints(1, 5); //Возращает индекс кодовой точки , которая стоит на 5 кодовых точек от исходной позиции 1
        System.out.println(myInt2);

        if(str.startsWith("Wel")) {
            System.out.println("True");
        }
        if(str.endsWith("ome!")){
            System.out.println("True");
        }
        if(str.startsWith("el", 1)){
            System.out.println("True");
        }
        // Возращает логическое значение true, если строка оканчивается подстрокой.

        System.out.println(str.indexOf('l')); //индекс буквы 2
        System.out.println(str2.indexOf(str)); //точка вхождения
        System.out.println(str2.indexOf(str, 22)); // Зашел на позицию -1
        System.out.println(str.indexOf(str2)); // -1 отсутствует
        //Возращает индекс начала первой подстроки, совподающей со строкой str, или же индекс указанной точки str2. Если подстрока отсутствует равно -1.

        //indexOf == lasIndexOf - тоже самое только наоборот с канечной точки.

        System.out.println(str.length()); //8 - Возращает длинну строки

        int myInt3 = str.codePointCount(3, 5); //2
        System.out.println(myInt3); //Возращает количество кодовых точек между позициями 3 и 5

        System.out.println(str.replace("W", "B")); //Welcome == Belcome
        System.out.println(str2.replace("о", "a")); //Добро пожаловать == Дабра пажалавать
        //Возращает новую строку, которая получается замены всех подстрок oldString на newString

        System.out.println(str.substring(2)); //Welcome! == lcome!
        System.out.println(str.substring(2, 4)); //Welcome! == lc
        //Возращает новую строку, состоящую из всех кодовых едениц, начиная с 2 до 4

        System.out.println(str.toLowerCase()); // Welcome! == welcome!
        System.out.println(str.toUpperCase()); //Welcome! == WELCOME!
        //Возращает новую строку в нижнем регистр и в верхнем регист

        System.out.println(str3.trim()); //Возращает новую строку, из которой исключены все начальные и конечные пробелы

        StringBuilder myBulder = new StringBuilder();
        myBulder.append("Первое "); //Добавляет строку и возащает ссылку this
        myBulder.append("Второе");
        System.out.println(myBulder.toString()); //Собирает строки в месте, лучше использовать его вместо "Первое "+"Второе", жрет меньше памяти
        System.out.println(myBulder.length()); //13 - количество символов в строке
        System.out.println(myBulder.insert(myBulder.length(), str3)); //Первое Второе _Welcome_ - Вставляет строку на позицию
        System.out.println(myBulder.reverse()); //_emocleW_ еоротВ еовреП - Возращает строку в обратном порядке
        System.out.println(myBulder.delete(1,11)); //еоротВ еовреП - Удаляет символы в данной строке с указанным начальным индексом и конечным

        Scanner myScanner = new Scanner(System.in);
        //String str4 = myScanner.nextLine(); //- полная строка
        //String str4 = myScanner.next(); - одно слово из строки
        //int myInt4 = myScanner.nextInt(); - для чтения целочисленных значении
        //double myDouble1 = myScanner.nextDouble(); - для чтения числового значенияс плавающей точкой
    }
}
