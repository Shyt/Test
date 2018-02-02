package MyMessageFormat;

import java.text.MessageFormat;
import java.util.GregorianCalendar;

public class MyMassageFormat {
    public static void main(String[] args) {
        String s1 = "On {1, date,full} was {0}, {2,choice,0#no houses|1#one house|2#{2} houses} was destroed";
        String s2 = MessageFormat.format(s1, "huracane", new GregorianCalendar(2017,2,22).getTime(), 0);
        System.out.println(s2);
    }
}
