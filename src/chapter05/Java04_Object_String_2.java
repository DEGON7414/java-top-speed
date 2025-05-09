package chapter05;

public class Java04_Object_String_2 {
    public static void main(String[] args) {
        //TODO String 比較
        String a = "a";
        String A = "A";
        //測試 1 這裡比的是內容 可以點進去看
        //首先會先檢查記憶體地址 再來看是否為字串 內容是否相同
        System.out.println(a.equals(A));
        //比較 忽略大小寫
        System.out.println(a.equalsIgnoreCase(A));
        //測試2 比較大小 使用 UNICODE中編碼做運算
        int i = a.compareTo(A);
        //A = 65 a = 97 97-65 = 32
        /*
        < 0：當前對象 小於 o
        = 0：當前對象 等於 o
        > 0：當前對象 大於 o
        * */
        System.out.println(i);//


    }

}