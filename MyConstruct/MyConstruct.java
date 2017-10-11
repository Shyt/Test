package MyConstruct;

public class MyConstruct {
    public static void main(String[] args){
        Person person = new Person();
        person.info();
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info(){
        System.out.println(name + "," + age);
    }
}
