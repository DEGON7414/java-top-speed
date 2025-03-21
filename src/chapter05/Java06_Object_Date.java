package chapter05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java06_Object_Date {
    public static void main(String[] args) throws ParseException {
     //TODO 日期類
        //Date 時間戳 毫秒
        System.out.println(System.currentTimeMillis());


        //TODO Calender 日曆類
        Date date = new Date();
        System.out.println(date);

        //Java 格式化日期格式
        //y(Y) ->年 -> yyyy
        //m(M)-> 月 ->mm 分鐘
        //d(D)-> dd 一個月中的日子 D 一年的日期
        //h(H)->h 12進制 H 24進制
        //s(S)-> s:秒 S毫秒

        //Date ->  String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        //String -> Date
        String dateString = "2025-03-21";
        Date parse = simpleDateFormat.parse(dateString);

        //根據時間戳建構指定日期對象
        date.setTime(System.currentTimeMillis());
        //獲得時間戳
        long time = date.getTime();
        System.out.println(time);

    }

}