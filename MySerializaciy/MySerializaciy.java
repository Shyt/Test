package MySerializaciy;

import java.io.Serializable;

public class MySerializaciy implements Serializable {
    private int id;
    private transient String name; //Эта строка не будет добавленна
    private static int nn = 55;//Статик не сереализуются

    public MySerializaciy(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}