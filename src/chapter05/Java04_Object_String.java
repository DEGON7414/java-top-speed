package chapter05;

public class Java04_Object_String {
    public static void main(String[] args) {
    //TODO String
        //java.lang.String
        //字符串
        String s = new String("黑崎一護");
        //本質上 就是 char [](JDK8之前) ，byte[]
        char[] cs = {'屍','魂','界'};
//        byte[] bs = {-27,-72,-83};
        String s1 = new String(cs);
//        String s2 = new String(bs,"UTF-8");
        System.out.println(s1);

        //轉義字符 \" => 雙引號
        String s3 = "\"";
        System.out.println(s3);
        //空格
        System.out.println("a\tb");
        //換行
        System.out.println("c\nd");
        // \
        System.out.println("e\\f");


    }

}