package MyCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        Collection collection = new ArrayList();

        //Добавление
        collection.add("1");
        collection.add("2");
        collection.add("3");

        //Удаление
        collection.remove("2");

        //Вывод
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object i : collection) {
            System.out.println(i);
        }
    }
}
