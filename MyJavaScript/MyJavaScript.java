package MyJavaScript;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MyJavaScript {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        engine.put("k", 4);
        String code = "" +
                "function f(a){" +
                "   return a;" +
                "};" +
                "var n = 1 + 2;" +
                "print('hello');" +
                "";

        Object str = engine.eval(code);
        System.out.println(str);

        Object str2 = ((Invocable)engine).invokeFunction("f", 1);
        System.out.println(str2);

        System.out.println(engine.get("n"));
    }
}
