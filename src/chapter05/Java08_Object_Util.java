package chapter05;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Java08_Object_Util {
    public static void main(String[] args) throws Exception {
        //TODO 工具類
        //工具類不應創建物件才能用 意味者一般都是靜態的
        //工具類對外提供的屬性或方法應該都要公共
        //1.判斷字串是否為空
        System.out.println(StringUtil.isEmpty(null));//t
        System.out.println(StringUtil.isEmpty(""));//t
        System.out.println(StringUtil.isEmpty("   "));//t
        System.out.println(StringUtil.isEmpty("ABC"));//f
        //2.產生隨機ID
        System.out.println(StringUtil.makeString());
        //3.從字串中隨機拿走n個元素
        System.out.println(StringUtil.makeString("abcd12345", 3));
        //4.日期格式化
        System.out.println(StringUtil.formatDate(new Date(), "yyyy-MM-dd"));
        //5.字串轉日期
        System.out.println(StringUtil.parseDate("2020-06-14", "yyyy-MM-dd"));


    }

}

class StringUtil {
    //非空判斷
    public static boolean isEmpty(String str) {
//		//如果字符串為null 為空
//		if (str == null) {
//			return true;
//		}
//		//如果字符串為空字符串 為空
//		if ("".equals(str)) {
//			return true;
//		}
//		//如果字符串都是空格 為空
//		if ("".equals(str.trim())) {
//			return true;
//		}
        //可以簡寫
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);

    }

    public static String makeString() {
        return UUID.randomUUID().toString();

    }
    //從字串中隨機拿走n個元素
    public static String makeString(String from, int len) {
        //1.檢查是否<1 <1送他一個空字串
        if (len < 1) {
            return "";
        } else {
            //2.轉一個char 陣列
            char[] chars = from.toCharArray();
            //3.建立stringbuilder來對選中的元素進行拼接
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < len; i++) {
                //4.建立 Random物件來生成隨機數
                Random random = new Random();
                //5.隨機選取索引
                int j = random.nextInt(chars.length);
                char c = chars[j];
                //6.添增到StringBuilder
                str.append(c);
            }
            //7.return 成一個字串
            return str.toString();
        }
    }

    //轉換成日期
    public static Date parseDate(String dateString, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(dateString);
    }

    //轉換成文字
    public static String formatDate(Date date, String format) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

}
