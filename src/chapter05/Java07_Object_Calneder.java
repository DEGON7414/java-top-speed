package chapter05;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Java07_Object_Calneder {
    public static void main(String[] args) throws ParseException {
     //TODO 日期類
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH));
        System.out.println(instance.get(Calendar.DATE));
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));

        instance.setTime(new Date());

        //當前日曆加上一年
        instance.add(Calendar.YEAR, 1);

    }

}