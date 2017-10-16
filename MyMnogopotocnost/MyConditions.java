package MyMnogopotocnost;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    Суть работы как wait и notify
 */

public class MyConditions {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account= 0;

    public static void main(String[] args) {
        new AccountPlus().start();
        new AccountMinus().start();
    }

    static class AccountPlus extends Thread{
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread{
        @Override
        public void run() {
            if(account < 10){
                try {
                    lock.lock();
                    condition.await(); //Дальше не произойдет пока await не получит сигнал на добро если средст длясписания не хватает ,если хватает он проскочит этот момент
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account -= 10;
            }
        }
    }
}
