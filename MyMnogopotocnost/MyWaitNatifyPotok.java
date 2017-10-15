package MyMnogopotocnost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    Упрощенный смысл у нас есть рисование и печать.
    Чтоб не блочили друг друга например пока рисует не печатает или на оборот за этого можно создать 2 Потока и чтоб когда печать закончилась и каждых 3 сек не спрашивал нас нарисовали мы чего? для этого и нужен notify.
    Когда первый поток дойдет до wait он будет ждать и скажет notify меня когда закончишь
 */
public class MyWaitNatifyPotok {
    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        new Operator().start();
        new Machine().start();
    }

    static class Operator extends Thread{
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            while(true){
                synchronized (strings){
                    strings.add(scanner.nextLine());
                    strings.notify(); //Срабатывает при каждой введеной строчкой
                }
                try {
                    Thread.sleep(500); //Нужна чтоб не появлялось голодование, потому как wait откидывает и сразу запускается Первый поток и получается что 2 поток не успевает срабатывать
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Machine extends Thread{
        @Override
        public void run() {
            while (strings.isEmpty()){ //Проверка на пустой лист
                synchronized (strings){
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(strings.remove(0));
                }
            }
        }
    }
}
