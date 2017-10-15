package MyMnogopotocnost;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyTryLockPotok {
    static Lock lock = new ReentrantLock();
    public static void main(String[] args) {

    }

    static class Thread1 extends Thread{
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + "start working");
            try {
                sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "stop working");
            lock.unlock();
            System.out.println(getName() + "lock is released");
        }
    }

    static class Thread2 extends Thread{
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
            while (true){
                if(lock.tryLock()){ //Эфек в том что пока блок не разблакируется то tryLock не произойдет
                    System.out.println(getName() + " working");
                    break;
                }else{
                    System.out.println(getName() + " waiting");
                }
            }
        }
    }
}
