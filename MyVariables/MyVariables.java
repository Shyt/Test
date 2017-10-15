package MyVariables;

public class MyVariables {
    public static void main(String[] args){
        int myInt = 1;//(4байта) от -2.147.483.648 до 2.147.483.647
        short myShort = 2;//(2байта) от -32.768 до 32.767
        long myLong = 3;//(8байт) от -9.223.372.036.854.775.808 до 9.223.372.036.854.775.807
        byte myByte = 4;//(1байт) от -128 до 127
        float myFloat = 5f;//(4байта) от 3,402.823.47E+38F(6-7 значащих десятичных цифр)
        double myDouble = 6;//(8байт) от 1,797.693.134.862.315.7E+308F(15 значащих десятичных цифр)
        boolean myBoolean = false; //(false\true)
        char myChar = 'a';//Служит для представление отдельных символов
        System.out.println("Примитивные типы");

        //Переопределение + Обертки
        Integer j = new Integer("6");
        Integer k = Integer.parseInt("2");

        float f = 12.3F; //В float из double
        double d = 11111111111L; //В long из int

        double myDouble2 = 10.2;
        int myInt2 = (int)myDouble2; //Просто не позволит перевести потому как потеря вещественного числа
        byte myByte2 = (byte) 129; // -127, логика придел 127 а тут 129 значит 2 поверх (127:-128:-127)

    }
}
