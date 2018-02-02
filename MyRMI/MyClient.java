package MyRMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Enumeration;

public class MyClient {
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        Enumeration<NameClassPair> e = context.list("rmi://localhost");
        while (e.hasMoreElements()){
            System.out.println(e.nextElement().getName());
        }

        IMath iMath = (IMath)context.lookup("rmi://localhost/imath");
        int rezult = iMath.add(1,2);
        System.out.println(rezult);
    }
}
