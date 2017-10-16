package MyMnogopotocnost;

import java.util.concurrent.Semaphore;

public class MySemofors {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2); //Мы определили что у нас 2 ресурса, он нам помогает работать с ресурсами в потоках

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.table = table;
        person2.table = table;
        person3.table = table;
        person4.table = table;
        person5.table = table;

        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();
    }
}

class Person extends Thread{
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " Ждет");

        try {
            table.acquire(); //Запрашиваем столик
            System.out.println(this.getName() + " Ест");
            this.sleep(1000); //Ждем пока поест типа
            System.out.println(this.getName() + " Возращает столик");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
