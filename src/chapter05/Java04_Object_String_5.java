package chapter05;

public class Java04_Object_String_5 {
    public static void main(String[] args) {
        //TODO String 轉換大小寫
        //測試1 全轉 小寫和大寫
        String s = "Gojo satorU";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println("*********");
        //測試2 substring 根據條件 返回字串
        //第一個參數 開始位置(含) 第二個參數 結束位置(不含)
        String s1 = s.substring(0, 1);//G
        String s2 = s.substring(1);//ojo satorU
        System.out.println(s1);
        System.out.println(s2.toLowerCase());
        //拼接 使用stringbuilder
        System.out.println(s1.toLowerCase() + s2.toLowerCase());


    }

}