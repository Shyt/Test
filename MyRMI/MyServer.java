package MyRMI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


//start server 2 step
//1. (console) rmiregistry
//2. (VM options) -Djava.rmi.server.codebase=http://localhost:1099/imath


public class MyServer {
    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException, MalformedURLException {
        Context context = new InitialContext();
        context.bind("rmi://localhost:1099/imath", new IMathImpl());

        //context.bind("rmi:imath", new IMathImpl());
        //Naming.bind("imath", new IMathImpl());
    }
}

interface IMath extends Remote{
    int add(int a, int b) throws RemoteException;
}

class IMathImpl extends UnicastRemoteObject implements IMath{

    protected  IMathImpl() throws RemoteException{
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
