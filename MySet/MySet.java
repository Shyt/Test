package MySet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set set1 = new TreeSet(); //Отсортированный

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
        set1.add("2");
        set1.add("1");
        set1.add("3");

        //Вывод
        for (Object o : set1) {
            System.out.println(o); //1,2,3 - Повторяющие элементы не выводит
        }
    }
}
