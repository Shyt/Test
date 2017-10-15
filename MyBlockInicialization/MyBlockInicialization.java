package MyBlockInicialization;

public class MyBlockInicialization {
    static {
        System.out.println("Static init block");
    }
    {
        System.out.println("init block");
    }

    public static void main(String[] args) {
        //1.static init block
        new MyBlockInicialization(); //2. init block
    }
}
