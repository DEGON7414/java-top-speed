package chapter05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Java08_Object_Util {
    public static void main(String[] args) throws Exception {
     //TODO 工具類
    	//工具類不應創建物件才能用 意味者一班都是靜態的
    	//工具類對外提供的屬性或方法應該都要公共
    	System.out.println(StringUtil.isEmpty(null));
    	System.out.println(StringUtil.isEmpty(""));
    	System.out.println(StringUtil.isEmpty("   "));
    	System.out.println(StringUtil.isEmpty("ABC"));
    	
    	System.out.println(StringUtil.makeString());
    	System.out.println(StringUtil.makeString("abcd12345",3));
 
    	
    	
    	System.out.println(StringUtil.formatDate(new Date(),"yyyy-MM-dd"));
    	System.out.println(StringUtil.parseDate("2020-06-14","yyyy-MM-dd"));
    		

    }

}
class StringUtil{
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
		if (str == null||"".equals(str.trim())) {
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
	public static String makeString(String from,int len) {
		if (len <1) {
			return "";
		}else {
			char[] chars = from.toCharArray();
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < len; i++) {
				Random random = new Random();
				int j = random.nextInt(chars.length);
				char c = chars[j];
				str.append(c);
			}
			return str.toString();
		}
	}
	
	//轉換成日期
	public static Date parseDate( String dateString, String format ) throws Exception {
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    return sdf.parse(dateString);
	}
	//轉換成文字
	public static String formatDate( Date date, String format ) throws Exception {
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    return sdf.format(date);
	}
	
}
