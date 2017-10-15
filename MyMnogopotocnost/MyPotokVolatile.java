package MyMnogopotocnost;

public class MyPotokVolatile {
    volatile static int i = 0; //Нужно обезательно использовать потому как строчка i кэшируется и не изменяется, и поток не может прочитать для него i всегда 0, а volatile - запрещает кэширование
    public static void main(String[] args) {
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static  class MyThreadRead extends Thread{
        @Override
        public void run() {
            while (i < 5){
                System.out.println("increment i to " + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadWrite extends Thread{
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5){
                if(localVar != i){
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }
    }
}
