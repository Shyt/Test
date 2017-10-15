package MyMnogopotocnost;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicPotok {
    static AtomicInteger atomicInteger = new AtomicInteger(0); //Если использовать просто строки то может произойти сбой в потоке если они будут изменять одну и туже строку, заскакивая на дуг друга
    public static void main(String[] args) throws InterruptedException {
        for (int j = 0; j < 10_000; j++){
            new MyThread().start();
        }
        Thread.sleep(1_000);
        System.out.println(atomicInteger.get()); //i - Вывод
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            atomicInteger.incrementAndGet(); //i++ - вариант, если выводить просто строкой может быть 9997 или 9994, а ватомарном варианте всегда будет 10_000 потому как он не позволяет заскакивать
        }
    }
}
