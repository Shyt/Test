package MyMnogopotocnost;

import java.util.concurrent.Exchanger;

public class MyExchanger {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>(); //Передавать данные между потоками

        new Mike(exchanger);
        new Anket(exchanger);
    }

    static class Mike extends Thread{
        Exchanger<String> exchanger;

        public Mike(Exchanger<String> exchanger){
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                exchanger.exchange("Good");
                sleep(3000);
                exchanger.exchange("Bye");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    static class Anket extends Thread{
        Exchanger<String> exchanger;

        public Anket(Exchanger<String> exchanger){
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
