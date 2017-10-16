package MyMnogopotocnost;

import java.util.concurrent.CountDownLatch;

public class MyCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); //Сколько должно завершиться потоков, как некий счетчик завершенных потоков
        //countDownLatch.await(); //будет ждать пока оне станет 0, после этого запустится

        new Work(countDownLatch);
        new Work(countDownLatch);
        new Work(countDownLatch);

        countDownLatch.await(); //с начало дождется завершение предыдущих потоков
    }
}

class Work extends Thread{
    CountDownLatch countDownLatch;

    public Work(CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Закончил работу");
        countDownLatch.countDown(); //уменьшили счетчик на 1
    }
}