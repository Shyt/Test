package MyEquals;

public class MyEquals {
    public static void main(String[] args){
        //System.out.println("Hello".equalsIgnoreCase("hello")); //True - Проверка идентичность строк, игнорируя отличия в прописных и строчных буквах.
       // System.out.println("Hello".equals("hello"));//False
       // System.out.println("Hello".equals("Hello"));//True

        /*Можно испьзовать compareTo, но лучше использовать equals*/
        //String str = "Hello";
        //if(str.compareTo("Hello") == 0){
        //    System.out.println("True");
        //}
        //if(str.compareToIgnoreCase("hello") == 0){
        //    System.out.println("True");
        //}

        Person myPerson1 = new Person(1);
        Person myPerson2 = new Person(1);

        System.out.println(myPerson1.equals(myPerson2));
    }
}

class Person{
    private int id;

    public Person(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        Person otherPerson = (Person) obj;
        return this.id == otherPerson.id;
    }
}
