package MyCollator;

import java.text.Collator;
import java.util.ArrayList;
import java.util.List;

public class MyCollator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("AA");
        list.add("ÄÄ");

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY); //A=Ä A=a
        collator.setStrength(Collator.SECONDARY); //A!=Ä A=a
        collator.setStrength(Collator.TERTIARY); //A!=Ä A!=a
        for(String s : list){
            System.out.println(s);
        }
    }
}
