package MyList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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

        //Добавлять
        cars2.add("Toyota");
        cars2.add("Ferrari");
        cars2.add("Gaz");

        //Заменять
        cars2.set(2,"Yaz");

        //Вытаскивать
        String myCar2 = cars2.get(0);
        System.out.println(myCar2);

        for (int i = 0; i < cars2.size(); i++){
            System.out.println(cars2.get(i));
        }

        //List<Integer> list;

        List list2 = new ArrayList(); //Лучше удалять
        List list3 = new Vector(); //синхронезирований но тотже ArrayList
        List list4 = new LinkedList(); //Лучше добавлять + Вытаскивать (в очередях и стеках)

    }
}
