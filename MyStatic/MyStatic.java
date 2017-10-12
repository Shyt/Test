package MyStatic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MyStatic {
    public static void main(String[] args){
        new Person();
        System.out.println(Person.getCountPeople()); //не нужно создавать объекты чтоб достать статику. к ней обращаются через название класса
        new Person();
        System.out.println(Person.getCountPeople());

    }

    interface MyInterface{ //Внутренние интерфейся всегда статические

    }
}

class Person{
    private String name;
    private int age;
    private static int countPeople; //Статическая переменная не создается каждый раз как создается объект

    public Person(){
        countPeople++;
    }

    public static int getCountPeople() {
        return countPeople;
        //Здесь можно указывать только статические переменные ,другие будут ошибками
    }
}

/*1. Статик не может быть Class и interface верхнего уровня
public class MyStatic {
    public static void main(String[] args){

    }
}
static interface MyInterface{ --error

}
static class MyClass{ --error

}
*/


/* 1 Вариант
Зачем нужен блок инциализации?
public class MyStatic {
    public static int i;
    public static int getI() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("name");
        return 5;
    } //По сути можно было создать только метод и готово, но если нужно вытащить исключение то уже не попасть, вот нам и поможет инциализационный блок
    static {
        try {
            i = getI();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        new MyStatic();
    }
}
*/

/* 2 Вариант
public class MyStatic {
    public static int[] i = new int[3]; //У нас есть массив
    static {
        i[0] = 23;
        i[1] = 222;
        i[2] = 1;
    }//А тут мы его можем проинициализировать
    public static void main(String[] args){

    }
}
*/

/* 3 Вариант
public class MyStatic {
    static{
        i = 10;
    }
    public static int i = 0;
    static {
        i++;
    }//Равно 1; Потому как сначало создаётся i за тем инициализируется 10, потом 0 и за тем i++ = 1
    public static void main(String[] args){

    }
}

 */