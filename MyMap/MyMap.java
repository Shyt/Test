package MyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Book{
    String autor;
    String name;
}

class Ticket{
    int number;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (number != ticket.number) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return number;
    }
}

public class MyMap {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.number = 4444;
        Book book = new Book();
        book.autor = "a";
        book.name = "b";
        Map<Ticket, Book> library = new HashMap<>();
        library.put(ticket, book);
        /*
        library.put("2", "Горе от ума");
        library.put("3", "Муму");
         */

        //Вытаскиваем
        Ticket ticket1 = new Ticket();
        ticket1.number = 4444;
        Book num1 = library.get(ticket1);
        System.out.println(num1.autor);

    /*
        Set set = library.entrySet(); //По всему списку
        Set set = library.keySet(); //По ключам
        for (Object o : set) {
            System.out.println(o);
        }
    */
        System.out.println(book.hashCode());


    }
}