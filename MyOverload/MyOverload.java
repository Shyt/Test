package MyOverload;

public class MyOverload {
    int addTwoDigits(int a, int b){
        return a + b;
    }

    double addTwoDigits(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        MyOverload myOver = new MyOverload();
        System.out.println(myOver.addTwoDigits(1, 2));
        System.out.println(myOver.addTwoDigits(1.3, 1.8));
    }
    //Перегрузка одного и того же метода
}
