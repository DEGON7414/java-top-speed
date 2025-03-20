package chapter05;

import java.util.Arrays;

public class Java04_Object_String_3 {
    public static void main(String[] args) {
       //TODO String 截斷
        //substring 擷取 字符串 兩個參數
        //第一個參數 擷取字符串的起始位置(索引、包含)
        //第二個參數           結束位置(索引、不包含)
        String s = "我問你，你到底再說什麼阿";
        System.out.println(s.substring(0,3));
        System.out.println(s.substring(0,"我問你".length()));
        System.out.println(s.substring(6,s.length()));
        //只傳一個 預設就是 開始位置 到最後
        System.out.println(s.substring(2));
        //分解 .split
        String[]s1 = s.split("，");
        System.out.println(Arrays.toString(s1));
        System.out.println("第一節:"+s1[0]);

        //TODO trim 去除字符串首尾空格
        String x = "  我問你,你到底再說什麼阿  ";
        System.out.println("!"+x.trim()+"!");


    }

}