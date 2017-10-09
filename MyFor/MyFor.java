package MyFor;

public class MyFor {
    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            if(i%2 == 0){
                continue; //Продолжает выполнять но после него нечего не обрабатывается
            }
            System.out.println(i);
        }
    }
}
