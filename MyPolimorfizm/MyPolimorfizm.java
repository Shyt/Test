package MyPolimorfizm;

public class MyPolimorfizm {

    void useCar(Car car){
        car.color();
    }

    public static void main(String[] args){
        MyPolimorfizm myPolimorfizm = new MyPolimorfizm();

        Car myCar1 = new Toyota(); //Суть в том что мы создаем Car но с данными Toyota
        myPolimorfizm.useCar(myCar1);

        Car myCar2 = new Ferrari();
        myPolimorfizm.useCar(myCar2);

    }
}

class Car{
    public void color(){
        System.out.println("Red");
    }
}

class Toyota extends Car{
    public void color(){
        System.out.println("Green");
    }
}

class Ferrari extends Car{

}