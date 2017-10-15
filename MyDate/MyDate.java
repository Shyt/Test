package MyDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    public static void main(String[] args){

        //Date
        System.out.println(new Date()); //Mon Oct 09 10:09:22 GMT+04:00 2017
        System.out.println(new Date().toString());

        //Calendar
        GregorianCalendar myNow1 = new GregorianCalendar();
        int myMonth1 = myNow1.get(Calendar.MONTH);
        int myWeekday1 = myNow1.get(Calendar.DAY_OF_WEEK);
        System.out.println(myMonth1 +" = "+ myWeekday1); //9месяц = 2число

        GregorianCalendar myNow2 = new GregorianCalendar();
        myNow2.set(2012, Calendar.SEPTEMBER, 8); //Создать свое время
        System.out.println(myNow2.get(Calendar.MONTH)); //8месяц

        myNow1.add(Calendar.MONTH, 1); //Сдвинул на 1месяц вперед (Если отрицательное значение сдвигается назад)
        System.out.println(myNow1.get(Calendar.MONTH)); //10месяц

        //add, set - Методы модифицируещие
        //get - Метод доступа

        //DataFormat
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); //Общий формат, new не указывается
        System.out.println(dateFormat.format(myNow2.getTime()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(myNow2.getTime()));

        //Обратное преобразование
        try {
            Date newDate = simpleDateFormat.parse("23/05/1964 05:22");
            System.out.println(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
