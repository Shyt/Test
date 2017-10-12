package MyList;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args){

        /*до Java 5*/
        List cars = new ArrayList();
        cars.add("Toyota");
        cars.add("Ferrari");
        String myCar = (String) cars.get(1);
        System.out.println(myCar);

        /*С появлением дженериков*/
        List<String> cars2 = new ArrayList<>();
        cars2.add("Toyota");
        cars2.add("Ferrari");
        String myCar2 = cars2.get(0);
        System.out.println(myCar2);

    }
}
