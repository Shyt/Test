package MyMnogopotocnost;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLockPotok {
    public static void main(String[] args) throws InterruptedException {
        Resourses resourses = new Resourses();
        resourses.i = 5;
        resourses.j = 5;

        MyThreadsC myThreads = new MyThreadsC();
        MyThreadsC myThreads1 = new MyThreadsC();

        myThreads.resourses = resourses;
        myThreads1.resourses = resourses;

        myThreads.start();
        myThreads1.start();

        myThreads.join();
        myThreads1.join();
        System.out.println(resourses.i);
        System.out.println(resourses.j);
    }

    static class MyThreadsC extends Thread{
        Resourses resourses;

        @Override
        public void run() {
            resourses.changeIs();
            resourses.changeJs();
        }
    }
}

class Resourses{
    int i;
    int j;

    Lock lock = new ReentrantLock(); //Можно использовать вместо синхронизации

    public void changeIs(){
        lock.lock(); //Начало
        int i = this.i;
        i++;
        this.i = i;
    }
    public void changeJs(){
        int j = this.j;
        j++;
        this.j = j;
        lock.unlock(); //Конец
    }
}

