package chapter05;

import java.nio.charset.StandardCharsets;

public class Java04_Object_String_6 {
    public static void main(String[] args) {
       //TODO String 查找
        String s = "Hello World";
        char[] charArray = s.toCharArray();
        System.out.println(charArray);//char[]可以直接print
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes);//[]輸出地址值
        //cahr at 可以傳遞索引定位字符串指定位置的字符
        System.out.println(s.charAt(0));
        //index of 可以找到 資料在字符串中第一次出現位置
        System.out.println(s.indexOf("World"));
        //last index of 找出最後的位置
        System.out.println(s.lastIndexOf("World"));

        //是否有指定字 返回布林值
        System.out.println(s.contains("Hello"));
        //判斷是否以指定數據開頭 返回布林值
        System.out.println(s.startsWith("He"));
        System.out.println(s.endsWith("Hello"));



    }

}