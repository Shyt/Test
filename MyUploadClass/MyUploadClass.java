package MyUploadClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class MyUploadClass {
    public static void main(String[] args) throws ClassNotFoundException, MalformedURLException {
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file://home/root/MyJar.jar")});
        Class cl = urlClassLoader.loadClass("MyClass");
    }
}
