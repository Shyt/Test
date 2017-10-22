package MyRegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simple {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a"); //Указываем что ищим
        String string = "Jack is a boy"; //В этой строке
        Matcher m = p.matcher(string);
        while(m.find()){
            //System.out.println(m.start() + " " + m.group() + "\n"); //m.start - Позиция вхождения, m.group  - Что ищим
        }

        Pattern p1 = Pattern.compile("[a-c]"); //Найдет все символы от а,в,с
        String string1 = "Jack is a boy";
        Matcher m1 = p1.matcher(string1);
        while(m1.find()){
            //System.out.println(m1.start() + " " + m1.group() + "\n");
        }
        //[0-9a-zA-Z] 0,1,2,3,4,5,6,7,8,9 и весь алфавит и заглавными буквами

        Pattern p2 = Pattern.compile("s[^s]"); //^ - символ отрицания s[^s] - наиди все кроме, s[s^] так он будет искать и s и ^ как просто символы
        String string2 = "Jack is a boss";
        Matcher m2 = p2.matcher(string2);
        while(m2.find()){
            //System.out.println(m2.start() + " " + m2.group() + "\n");
        }

        //("\\d"); - будет искать [0-9]
        //("\\w"); - будет искать [a-zA-Z0-9 ]
        //("\\s"); - будет искать [ \t](Пробел или табуляция)
        //("\\D"); - не будет искать [^0-9]
        //("\\W"); - не будет искать [^a-zA-0-9 ]
        //("\\S"); - не будет искать [^ \t](Пробел или табуляция)
        //("\\s\\d"); - будет искать пробел а за ним цифра (вместе _3)
        //("[0-9]+"); - этих цифр будет много, + символы повторения
        //("[0-9]{1,2}"); - будет искать этих цифр от 1 до 2
        //.(точка) - заменяет практически любой символ

        //Pattern p3 = Pattern.compile("\\d\\d.\\d\\d.\\d\\d"); //(число)(число)(любой символ)(число)(число)(любой символ)(число)(число)
        Pattern p3 = Pattern.compile("\\d\\d[-/.]\\d\\d[-/.]\\d\\d"); //Для даты лучше использовать это
        String string3 = "02/12/03";
        Matcher m3 = p3.matcher(string3);
        while(m3.find()){
            //System.out.println(m3.start() + " " + m3.group() + "\n");
        }

        //Pattern p4 = Pattern.compile("\".*\""); //Поиск строки которая между ковычкаи а * - обозначает что между ними бесконечное колличество символов может быть. Greedy quantifiers
        //Pattern p4 = Pattern.compile("\".*?\""); //Reluctant quantifiers
        Pattern p4 = Pattern.compile("\"[^\"\r\n]*\""); //поиск
        String string4 = "02/1\"abc\"2/0\"def\"3";
        Matcher m4 = p4.matcher(string4);
        while(m4.find()){
            //System.out.println(m4.start() + " " + m4.group() + "\n");
        }

        // \b - граница слова, \b\w+\b - так можно разбивать строки
        Pattern p5 = Pattern.compile("\\bis\\b"); //поиск is
        String string5 = "This island is beautiful"; //тут много в словах is и раздельно,но я ищу только с пробелом в начале и конце
        Matcher m5 = p5.matcher(string5);
        while(m5.find()){
            //System.out.println(m5.start() + " " + m5.group() + "\n");
        }

        //Pattern p6 = Pattern.compile("^a"); //не путать ^a с [^a], ^a - искать в начале строки
        Pattern p6 = Pattern.compile("c$"); //c$ - искать в конце строки
        String string6 = "abc cba bac"; //
        Matcher m6 = p6.matcher(string6);
        while(m6.find()){
            //System.out.println(m6.start() + " " + m6.group() + "\n");
        }

        Pattern p7 = Pattern.compile("^\\d+$"); //В строке одни цифры, использовать + а не *
        String string7 = "1111"; //
        Matcher m7 = p7.matcher(string7);
        while(m7.find()){
            //System.out.println("it's  a number");
        }

        Pattern p8 = Pattern.compile("ne$", Pattern.MULTILINE); //ne$ - означает надо искать в конце строки
        //Pattern p8 = Pattern.compile("\\Ane\\Z", Pattern.MULTILINE); //\\A(^) и Z($) - тоже самое.
        String string8 = "first line\nsecond line"; //тутесть перенос строк \n но если запустить без Pattern.MULTILINE он выведет всего одно вхождение а так 2 потому как 2 строки
        Matcher m8 = p8.matcher(string8);
        while(m8.find()){
            //System.out.println(m8.start() + " " + m8.group() + "\n");
        }

        //|(pipeline) - или
        Pattern p9 = Pattern.compile("cat|dog"); // cat или dog
        String string9 = "I like my dog";
        Matcher m9 = p9.matcher(string9);
        while(m9.find()){
            //System.out.println(m9.start() + " " + m9.group() + "\n");
        }

        //Pattern p10 = Pattern.compile("GetValue|Get|Set|SetValue"); //Найдет Set Первое вхождение строк
        //Pattern p10 = Pattern.compile("Get(Value)|Set(Value)"); //SetValue
        //Pattern p10 = Pattern.compile("\\b(Get(Value)?|Set(Value)?)\\b"); //SetValue
        Pattern p10 = Pattern.compile("(Get|Set)(Value)?"); //SetValue

        String string10 = "SetValue";
        Matcher m10 = p10.matcher(string10);
        while(m10.find()){
            //System.out.println(m10.start() + " " + m10.group() + "\n");
        }

        //?(optionalItems) - colou?r что означает перед вопросительным знаком символ (или символы [a-Z]) он есть или нет
        //Pattern p11 = Pattern.compile("col(our)?"); //символы могут присудствовать (our) могут нет
        Pattern p11 = Pattern.compile("col(our)??");
        //Pattern p11 = Pattern.compile("colou?r");
        String string11 = "color colour, col";
        Matcher m11 = p11.matcher(string11);
        while(m11.find()){
            //System.out.println(m11.start() + " " + m11.group() + "\n");
        }

        //a* - повторенн от 0 до +n раз, a+ - повторенние от 1 до +n раз
        //\\Q1+1=2\\E - Это означает что все что между q и e это дословный текст потому как + заперещенный символ а так будет +
        //()группы - то что вскопках
        //Pattern p12 = Pattern.compile("<([A-Z][A-Z0-9]*)[^>]*>.*?</\\1>"); //</\\1> - Повторение группы первой ([A-Z][A-Z0-9]*)
        //Pattern p12 = Pattern.compile("([a-c])x\\1x\\1");//[a-c]x[a-c]x[a-c]
        Pattern p12 = Pattern.compile("<(?<tag>[A-Z][A-Z0-9]*)[^>]*>.*?</\\k<tag>>");
        //String string12 = "This is a <EM>first</EM> test";
        //String string12 = "axaxa";
        String string12 = "This is a <EM>first</EM> test group name";
        Matcher m12 = p12.matcher(string12);
        while(m12.find()){
            //System.out.println(m12.start() + " " + m12.group() + "\n");
        }
        //System.out.println("abc".replaceAll("(?<Aletter>a)", "${Aletter}-")); //name group

        //Unicode
        Pattern p13 = Pattern.compile("\u0061");
        String string13 = "a";
        Matcher m13 = p13.matcher(string13);
        while(m13.find()){
            System.out.println(m13.start() + " " + m13.group() + "\n");
        }

    }
}
