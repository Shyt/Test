package MyLocalOrInternal;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class MyLocal {
    public static void main(String[] args) {

        //update local *VM options*
        //-Duser.language=ru -Duser.region=RU

        Locale locale = new Locale("en", "US");
        Locale locale1 = Locale.getDefault();
        Locale locale2 = new Locale("de", "GR");

        //one local
        //System.out.println(locale2);

        //list local
        //Locale[] locales = Locale.getAvailableLocales();
        //for (Locale loc : locales){
            //System.out.println(loc);
        //}

        //local money
        //System.out.println(NumberFormat.getCurrencyInstance(locale).format(1000));
        //System.out.println(NumberFormat.getCurrencyInstance(locale1).format(1000));
        //System.out.println(NumberFormat.getCurrencyInstance(locale2).format(1000));

        //local date
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale1).format(new Date()));
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL,locale2).format(new Date()));

    }
}
