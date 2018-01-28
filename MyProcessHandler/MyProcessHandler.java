import java.io.IOException;

public class MyProcessHandler{
    public static void main(String[] args) throws IOException, IllegalAccessError, InterruptedException {
     //   Process sleeper = Runtime.getRuntime().exec("sleep 1h");
       // System.out.println("current process id " + ProcessHandle.current().getPid());
       // System.out.println("sleep id " + sleeper.getPid());

       // ProcessHandle processHandle = ProcessHandle.of(sleeper.getPid()).orElseThrow(IllegalAccessException::new);
      //  processHandle.onExit().thenRun(() -> System.out.println("process has been closed"));
      //  System.out.println(processHandle.info().user().orElse("no user"));
      //  System.out.println(processHandle.info().commandLine().orElse("empty"));

     //   processHandle.destroy();


      //  Thread.sleep(100);
    }
}

//current process id 28263
//sleeper id 28335
//shelest
//bin/sleep 1h
//process has been closed