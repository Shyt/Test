package MyMnogopotocnost;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable(); //Вместо рунтабле, этот метод не только создает но еще и возращает значение
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get()); //Будет ждать пока все не сделается
    }

    static class MyCallable implements Callable<Integer>{
        @Override
        public Integer call() throws InterruptedException {
            int j = 0;
            for (int i = 0; i < 10; i++, j++){
                Thread.sleep(100);
            }
            return j;
        }
    }
}
