package MyLocalOrInternal;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyLocalOrInternal {
    public static void main(String[] args) throws InterruptedException, UnsupportedEncodingException {
        //ResourceBundle bundleDefault = ResourceBundle.getBundle("resource");
        //ResourceBundle bundleDefault = ResourceBundle.getBundle("resource", new Locale("ru"));
        //ResourceBundle bundleDefault = ResourceBundle.getBundle("resource", new Locale("en"));

        //System.out.println(new String(bundleDefault.getString("test").getBytes("windows-1251"),"UTF-8"));
        //System.out.println(bundleDefault.getString("test"));

        //with the help file
        ResourceBundle bundleDefault = ResourceBundle.getBundle("resource.resource");
        System.out.println(bundleDefault.getString("test"));
    }
}
