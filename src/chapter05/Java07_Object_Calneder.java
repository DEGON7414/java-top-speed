package chapter05;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Java07_Object_Calneder {
    public static void main(String[] args) throws ParseException {
        //TODO 日期類
        //1.取得Calendar類別物件
        Calendar instance = Calendar.getInstance();
        //2. 打印看看資訊
        System.out.println(instance);
        //3.取年
        System.out.println(instance.get(Calendar.YEAR));
        //4.取月(從0開始算)
        System.out.println(instance.get(Calendar.MONTH));
        //5.取日
        System.out.println(instance.get(Calendar.DATE));
        //6.取星期幾 周日是1
        System.out.println(instance.get(Calendar.DAY_OF_WEEK));
        //7.設為當前時間
        instance.setTime(new Date());
        //8.打印出來 月+1 星期-1
        System.out.println(
                        "日期："
                        + instance.get(Calendar.YEAR) + "年"
                        + (instance.get(Calendar.MONTH) + 1) + "月"
                        + instance.get(Calendar.DATE) + "日 " +
                        "星期" + (instance.get(Calendar.DAY_OF_WEEK) - 1)
                          );
        //當前日曆加上一年
        instance.add(Calendar.YEAR, 1);


    }

}