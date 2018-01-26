package MyProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("src/Myproperties/my.properties");
        properties.load(in);
        System.out.println(properties.getProperty("test","error"));
    }
}
