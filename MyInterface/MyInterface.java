package MyInterface;

public interface MyInterface {

    enum E{

    } //Можно добавлять enum static

    interface MyInnerInterface{

    } //Можно вкладывать интерфесы в нутрь также static

    class MyInnerClass{

    } //Можно вкладывать классы, static


    int i = 5; //Можно вкладывать строки, static
    public void sleep(); //Можно вкладывать методы
    public void eats();
}
