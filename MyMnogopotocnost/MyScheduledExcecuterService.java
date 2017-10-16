package MyMnogopotocnost;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduledExcecuterService {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor(); //Создам 1 поток
        scheduledExecutorService.schedule(new MyThread(), 3, TimeUnit.SECONDS); //Этот поток запустится через 3 секунды
        scheduledExecutorService.shutdown();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(1);
        }
    }
}
