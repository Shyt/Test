package MyVlojeniyClass;

public class MyVlojeniyClass {
    public static void main(String[] args){
        Car myCar = new Car(1);
        myCar.start();

        Car.Transport myTipCar = new Car.Transport();
        myTipCar.tipCar();

    }
}

class Car{
    private int id;

    //Вложенный нестатический класс, нужен для разбавление загруженного класса
    private class Motor{
        public void startMotor(){
            System.out.println("motor " + id);
        }
    }

    //Вложенная статическии класс, можно отображить то что не взаймодействует с объектом
    public static class Transport{
        public void tipCar(){
            System.out.println("automobile car");
        }
    }

    public Car(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int nn = 1;

        //Вложенный класс в метод, можно посути и анонимный класс
        class SomeClass{
            public void SomeMethod(){
                //Чтоб получить доступ к строке nn, она должна быть final
                System.out.println(nn);
                System.out.println(id);
            }
        }
    }
}