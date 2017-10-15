package MySet;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set set = new HashSet();

        //Добавление
        set.add("1");
        set.add("1");
        set.add("2");
        set.add("2");
        set.add("2");
        set.add("2");
        set.add("2");
        set.add("3");
        set.add("3");

        //Вывод
        for (Object o : set) {
            System.out.println(o); //1,2,3 - Повторяющие элементы не выводит
        }
    }
}
