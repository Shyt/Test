package MyFinal;

public class MyFinal {
    final int i; //1. Можно так

    {
        //i = 5; 2. Можно в поле инциализации
    }

    public MyFinal() {
        i = 0; //3. В конструкторе
    }

    public static void main(String[] args){

    }

    //public void setI(int i){
        //this.i = i;
    //} Невозможно вызвать в методах final потому как он существет только один
}



/*
1. final нельзя extends
2. Даже сделая final private, непоможет хотя на взгляд покажется все отлично
    но Полиморфизм не к черту потому как вызываеться будет One.
3. Так как final вызывается всего лишь раз его можно определять как статический таким способом при
    каждом создание объекта не будет расход памяти
public class MyFinal {
    public static void main(String[] args){

    }
}

class One{
    private final void method(){
        System.out.println("One");
    }
    public void executeMethod(){
        One one = new Two();
        one.method();
    }
}

class Two extends One{
    public void method(){
        System.out.println("two");
    }
}

*/