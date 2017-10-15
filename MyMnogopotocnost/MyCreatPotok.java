package MyMnogopotocnost;

public class MyCreatPotok {
    public static void main(String[] args) {
        //1 Вариант
        MyThread myThread = new MyThread();
        myThread.start();

        //2 Вариант
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

//1 Вариант
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

//2 Вариант
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}