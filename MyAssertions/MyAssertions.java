package MyAssertions;

public class MyAssertions {
    public static void main(String[] args) {
        new MyAssertions().someMethod(-2);
    }

    private void someMethod(int a){
        assert (a > 0); //Они нужны чаще для проверки аргументов метода, если будет выпадиш exception,но при компеляции assert будет убран программой. Есть еще одно по default они отключенны, например запустить можно при компиляции через командную строку java -ea *Фаил* только тогда и сработает ошибка
        //Также можно в настройках (intelliJ IDEA) запуска настроить в графе VM option записав туда -ea
    }
}
