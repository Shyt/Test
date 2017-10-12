package MyAnonimClass;

interface Cars{
    void colorCar();
}
public class MyAnonimClass {
    public static void main(String[] args){
        Cars colorCars = new Cars() {
            @Override
            public void colorCar() {
                System.out.println("Green");
            }
        };
        colorCars.colorCar();
        /*
        Cars car = new Cars();
        car.colorCars();
        Cars car2 = new Cars(){ //Анонимный класс, действует только раз за то удобнно.
           public void colorCars(){
               System.out.println("Green");
           }
        };
        car2.colorCars();
        */
    }
}

/*class Cars{
    public void colorCars(){
        System.out.println("Blue");
    }
}
*/