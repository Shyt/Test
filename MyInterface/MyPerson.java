package MyInterface;

public class MyPerson implements MyInterface {
    @Override
    public void sleep() {
        System.out.println("slepping");
    }

    @Override
    public void eats() {
        System.out.println("eats");
    }
}
