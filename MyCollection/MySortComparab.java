package MyCollection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Person{
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class MySortComparab {
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparePerson());
        set.add(new Person(35));
        set.add(new Person(15));
        set.add(new Person(758));
        set.add(new Person(999));
        set.add(new Person(55));
        set.add(new Person(1));
        for (Object o: set) {
            System.out.println(o);
        }
    }
}
