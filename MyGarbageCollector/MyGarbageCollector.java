package MyGarbageCollector;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyGarbageCollector {
    public static void main(String[] args) {
        //method();
        //В этом случае сборщик удалит сам объект date, потому как на нее нет ссылок

        //Date dt = method();
        //В этом случае нет, он так и будет весеть, чтоб определить на удаление нужно определить
       // dt = null; //Теперь он поймет что она больше не нужна

        //System.gc(); //Это вызов сборщика, но он может проигнорровать тебя, она сама себе хозяйн

        method2();
    }

    private static Date method(){
        Date date = new Date();
        System.out.println(date);
        return date;
    }

    private static void method2(){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("total memory before " + runtime.totalMemory());
        System.out.println("free memory before " + runtime.freeMemory());
        List<Date> dateList = new ArrayList<>(1_000_000);
        for (int i = 0; i < 1_000_000; i++){
            Date date = new Date();
            date = null;
            //dateList.add(date);
        }
        System.out.println();
        System.out.println("total memory after " + runtime.totalMemory());
        System.out.println("free memory after " + runtime.freeMemory());
        System.out.println();
        System.gc();
        System.out.println("total memory after " + runtime.totalMemory());
        System.out.println("free memory after " + runtime.freeMemory());



    }

    //Он запускается при запуске gc, но также он может не запуститься с характером
    @Override
    public void finalize(){

    }
}
