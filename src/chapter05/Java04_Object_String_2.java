package chapter05;

public class Java04_Object_String_2 {
    public static void main(String[] args) {
        //TODO String 比較
        String a = "a";

        String A = "A";
        System.out.println(a.equals(A));
        //比較 忽略大小寫
        System.out.println(a.equalsIgnoreCase(A));
        int i = a.compareTo(A);//比較大小 使用 UNICODE中編碼做運算
        //A = 65 a = 97 97-65 = 32
        /*
        < 0：當前對象 小於 o
        = 0：當前對象 等於 o
        > 0：當前對象 大於 o
        * */
        System.out.println(i);//


    }

}