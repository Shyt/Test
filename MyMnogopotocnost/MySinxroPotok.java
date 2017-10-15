package MyMnogopotocnost;

public class MySinxroPotok {
    public static void main(String[] args) throws InterruptedException {
        Resourse resourse = new Resourse();
        resourse.setI(5);
        MyThreads myThreads = new MyThreads();
        myThreads.setName("one"); //Имя потока
        MyThreads myThreads1 = new MyThreads();
        myThreads1.setResourse(resourse);
        myThreads.setResourse(resourse); //передаем потоку ресурс
        myThreads.start();
        myThreads1.start(); //Старт потока
        myThreads.join(); //Пока не выполнит не переключаться
        myThreads1.join();
        System.out.println(resourse.getI());

        //Статическая синхронизация
        Resourse.j = 5;
        MyThreads myThreads3 = new MyThreads();
        myThreads3.setName("one"); //Имя потока
        MyThreads myThreads4 = new MyThreads();
        myThreads4.setResourse(resourse);
        myThreads3.setResourse(resourse); //передаем потоку ресурс
        myThreads3.start();
        myThreads4.start(); //Старт потока
        myThreads3.join(); //Пока не выполнит не переключаться
        myThreads4.join();
        System.out.println(Resourse.j);

    }
}

class MyThreads extends Thread{
    Resourse resourse;

    public void setResourse(Resourse resourse) {
        this.resourse = resourse;
    }

    @Override
    public void run() {
        resourse.changeI();

        //Статическая синхронизация
        Resourse.changeStaticI();
    }
}

//Лучше не делать две разные синхронизации на одном ресурсе
class Resourse{
    private int i;
    static int j;

    public int getI() {
        return i;
    }

    public synchronized void setI(int i) {
        this.i = i;
    }

    public synchronized void changeI(){
        //synchronized (this){ //Синхронизируем чтоб пока не завершил с ним работать другому не давал иначе может быть сбой
            int i = this.i;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield(); //Скинуть действие
            }
            i++;
            this.i = i;
        //}
    }

    //Статическая синхронизация
    public static synchronized void changeStaticI(){
        //synchronized (Resource.class){ //Синхронизируем чтоб пока не завершил с ним работать другому не давал иначе может быть сбой
        int j = Resourse.j;
        if(Thread.currentThread().getName().equals("one")){
            Thread.yield(); //Скинуть действие
        }
        j++;
        Resourse.j = j;
        //}
    }
}
