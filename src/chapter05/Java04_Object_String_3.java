package chapter05;

import java.util.Arrays;

public class Java04_Object_String_3 {
    public static void main(String[] args) {
        //TODO String 截斷
        //substring 擷取 字符串 兩個參數
        //第一個參數 擷取字符串的起始位置(索引、包含)
        //第二個參數           結束位置(索引、不包含)
        //測試 1 直接print 1.可以傳參數 2.可以用.length取得長度
        //傳一個參數的情況
        //分解split
        //測試2 去除字符串首尾空格

        String s = "我問你，你到底再說什麼阿";
        System.out.println(s.substring(0, 3));
        System.out.println(s.substring(0, "我問你".length()));
        System.out.println(s.substring(6, s.length()));

        //只傳一個 預設就是 開始位置 到最後
        System.out.println("只傳一個參數 預設為開始索引位置到最後" + s.substring(2));
        //TODO 分解 .split
        String[] s1 = s.split("，");
        System.out.println("分解 .split" + Arrays.toString(s1));
        System.out.println("第一節:" + s1[0]);
        System.out.println("第二節:" + s1[1]);

        //TODO trim 去除字符串首尾空格
        String x = "  我問你,你到底再說什麼阿  ";
        System.out.println("!" + x.trim() + "!");


    }

}