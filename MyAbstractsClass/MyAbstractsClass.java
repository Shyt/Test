package MyAbstractsClass;

public class MyAbstractsClass {

    void settingCars(Cars car){
        car.moveCars();
        car.colorCars();
    }
    public static void main(String[] args){
        MyAbstractsClass main = new MyAbstractsClass();

        Cars myCars1 = new Toyota();
        main.settingCars(myCars1);

        Cars myCars2 = new Ferrari();
        main.settingCars(myCars2);
    }
}

abstract class Cars{
    void moveCars(){
        System.out.println("start move");
    } //Может указать свои методы
    abstract void colorCars(); //Также может указать абстрактный метод который должны будут выполнить расширенные классы для себя лично.
}

class Toyota extends Cars{

    @Override
    void colorCars() {
        System.out.println("Red");
    }
}

class Ferrari extends Cars{

    @Override
    void colorCars() {
        System.out.println("Green");
    }
}

