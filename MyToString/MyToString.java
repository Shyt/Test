package MyToString;

public class MyToString {
    public static void main(String[] args){
        Person person = new Person();
        System.out.println(person);
    }
}

class Person{
    @Override
    public String toString() {
        return "Person{}";
    }
}

//Если не перезадать toString то он выдает хэш код, а тут мы можем сами определить что выводить.
