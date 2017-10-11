package MyInkapsulycia;

public class MyInkapsulycia {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
    }
}

class Person{
    private String name = "Xeon";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//1. Инкапсуляция - это все поля это private
//2. Он не изменяется из других классов
//3. Если происходит изминения в нем то больше не где это не надо делать
//4. Доспут к полям онпозволяет через getter и setter