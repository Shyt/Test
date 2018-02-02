package CompiledJava;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class CompiledJava {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "/home/user/Test.java");
        System.out.println(result);
    }
}
