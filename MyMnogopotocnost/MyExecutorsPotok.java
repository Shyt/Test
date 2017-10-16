package MyMnogopotocnost;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorsPotok {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //ExecutorService executorService = Executors.newSingleThreadExecutor(); //1 поток
        ExecutorService executorService = Executors.newFixedThreadPool(200); //Можно определить сколько потоков например 200
        //ExecutorService executorService = Executors.newCachedThreadPool();//Не фексированный создает по необходимости потоки у него есть таим если поток не используется в течение 60сек он удаляется или переиспользуется

        executorService.submit(new MyRunable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown(); //Ждет завершение работы потока
        //executorService.shutdownNow(); //Не ждет завершение потока
    }

    static class MyRunable implements Runnable{
        @Override
        public void run() {
            System.out.println(1);
        }
    }

    static class MyCallable implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "2";
        }
    }
}
