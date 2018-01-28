package MyPatterns;

/* В чем смысл pattern AbstractFactory - это фабрика которая производит другие фабрики а не их товары*/
public class AbstractFactory {
    public static void main(String[] args) {
        Factorys carFactory = new AbstractFactorys().createFactory("Car");
        Cars toyota = carFactory.createCar("Ferrari");
        Cars audi = carFactory.createCar("Mercedes");
        toyota.drive();
        audi.drive();
    }
}

interface Cars {
    void drive();
}

class Ferrari implements Cars {
    @Override
    public void drive() {
        System.out.println("drive Ferrari");
    }
}

class Mercedes implements Cars {
    @Override
    public void drive() {
        System.out.println("drive Mercedes");
    }
}

class CarFactory implements Factorys {
    public Cars createCar(String typeOfCar){
        switch (typeOfCar){
            case "Ferrari": return new Ferrari();
            case "Mercedes": return new Mercedes();
            default: return null;
        }
    }

    @Override
    public Tanks createTank(String typeOfTank) {
        return null;
    }
}

interface Tanks {
    void drive();
}

class T34 implements Tanks {
    @Override
    public void drive() {
        System.out.println("drive T34");
    }
}

class T90 implements Tanks {
    @Override
    public void drive() {
        System.out.println("drive T90");
    }
}

class TankFactory implements Factorys {
    public Tanks createTank(String typeOfCar){
        switch (typeOfCar){
            case "T34": return new T34();
            case "T90": return new T90();
            default: return null;
        }
    }

    @Override
    public Cars createCar(String typeOfCar) {
        return null;
    }
}

interface Factorys {
    Cars createCar(String typeOfCar);
    Tanks createTank(String typeOfTank);
}
class AbstractFactorys {
    Factorys createFactory(String typeOfFactory){
        switch (typeOfFactory){
            case  "Car": return new CarFactory();
            case  "Tank": return new TankFactory();
            default: return null;
        }
    }
}
